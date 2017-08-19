package com.example.hp.ols;

import android.content.SharedPreferences;
import android.icu.util.Calendar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.StringTokenizer;

public class DisplayTimeSlot extends Fragment {
    View view;Button b1;
    ArrayList<String> timeslots=new ArrayList<>();
    Random random=new Random();


    SharedPreferences kl;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view= inflater.inflate(R.layout.activity_display_time_slot, container, false);
        kl=getActivity().getSharedPreferences("data", Context.MODE_PRIVATE);
b1=(Button)view.findViewById(R.id.SAdndC);
        for(String t:("10:00:AM 11:00:AM 12:00:PM 2:00:PM 3:00:PM 4:00:PM ").split(" ")){
            timeslots.add(t);
        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNotification();
            }
        });
        return view;
    }
    private void addNotification() {
        final SharedPreferences.Editor editor=kl.edit();
        int randomInt=random.nextInt(timeslots.size());String a=getCurrDate(),l=timeslots.get(randomInt);
        editor.putString("Date",a);
        editor.putString("Time",l);
        editor.apply();
        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(getActivity())
                        .setSmallIcon(R.drawable.ic_menu_send)
                        .setContentTitle("OLSAppointment Date::"+a)
                        .setContentText("Appointment At::"+ l);

        Intent notificationIntent = new Intent(getActivity(), Notification.class);
        PendingIntent contentIntent = PendingIntent.getActivity(getActivity(), 0, notificationIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);

        // Add as notification
        NotificationManager manager = (NotificationManager) getActivity().getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
    }

    private String getCurrDate()
    {int l,p,m,y;
       // String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String day= new SimpleDateFormat("dd").format(new Date());
        String mon = new SimpleDateFormat("MM").format(new Date());
        String year = new SimpleDateFormat("yyyy").format(new Date());
        p=Integer.parseInt(day); m=Integer.parseInt(mon);y=Integer.parseInt(year);
        if(p<29) l=p+3;
        else {l=1;m=m+1;
        if(m>12){
            y=y+1;
        }

        }
        return "'"+l+"'-'"+m+"'-'"+y+"'";
    }
    private int getHoursValue(int hours){
        return hours - 12;
    }

    private String displayTimeSlots(){
        String timeValue = "2015-10-28T18:37:04.899+05:30";
        StringTokenizer stringTokenizer = new StringTokenizer(timeValue,"T");
        String dateValue = stringTokenizer.nextElement().toString();
        String endDateValue = "2015-10-30";
        String restString= stringTokenizer.nextElement().toString();
        StringTokenizer secondTokeniser = new StringTokenizer(restString,":");
        String hours = secondTokeniser.nextElement().toString();
        String minutes = secondTokeniser.nextElement().toString();
        hours = String.valueOf(Integer.parseInt(hours) + 2);
        if (Integer.parseInt(minutes) > 30){
            minutes = "00";
        }else{
            minutes = "30";
        }

        String amOrPm;
        if(Integer.parseInt(hours) < 12){
            amOrPm = "AM";
        }else{
            amOrPm = "PM";
            hours = String.valueOf(getHoursValue(Integer.parseInt(hours)));
        }
        String time1 = hours + ":" + minutes + " " + amOrPm;
        String time2 = "12" + ":" + "00" + " AM ";
        String format = "yyyy-MM-dd hh:mm a";

        SimpleDateFormat sdf = new SimpleDateFormat(format);
        SimpleDateFormat sdf1=new SimpleDateFormat(format),sdf2=new SimpleDateFormat(format);
        try {
            Date dateObj1 = sdf.parse(dateValue + " " + time1);
            Date dateObj2 = sdf.parse(endDateValue + " " + time2);
           // Log.d("TAG", "Date Start: " + dateObj1);
            //Log.d("TAG", "Date End: " + dateObj2);
            long dif = dateObj1.getTime();
            while (dif < dateObj2.getTime()) {
                Date slot1 = new Date(dif);
                dif += 3600000;
                Date slot2 = new Date(dif);
                dif += 3600000;
                 sdf1 = new SimpleDateFormat("hh:mm a");
                 sdf2 = new SimpleDateFormat("hh:mm a, dd/MM/yy");

               // Log.d("TAG", "Hour slot = " + sdf1.format(slot1) + " - " + sdf2.format(slot2));

            }
        }catch (Exception ex){
            ex.printStackTrace();
        }  return sdf1.toString()+sdf2.toString();
    }

}
