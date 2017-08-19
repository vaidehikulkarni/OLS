package com.example.hp.ols;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment5 extends Fragment {
    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,e19,e20,e21,e22,e23,e24;
    Button b1,b2;
    public Fragment5() {
        // Required empty public constructor
    }
DataBaseHelper2 db;
SharedPreferences kl;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment4, container, false);
        b1=(Button)view.findViewById(R.id.submitt);
        b2=(Button)view.findViewById(R.id.back);
        db=new DataBaseHelper2(getActivity());
        e1=(EditText)view.findViewById(R.id.ed1);
        e2=(EditText)view.findViewById(R.id.ed2);
        e3=(EditText)view.findViewById(R.id.ed3);
        e4=(EditText)view.findViewById(R.id.ed4);
        e5=(EditText)view.findViewById(R.id.ed5);
        e6=(EditText)view.findViewById(R.id.ed6);
        e7=(EditText)view.findViewById(R.id.ed7);
        e8=(EditText)view.findViewById(R.id.ed8);
        e9=(EditText)view.findViewById(R.id.ed9);
        e10=(EditText)view.findViewById(R.id.ed10);
        e11=(EditText)view.findViewById(R.id.ed11);
        e12=(EditText)view.findViewById(R.id.ed12);
        e13=(EditText)view.findViewById(R.id.ed13);
        e14=(EditText)view.findViewById(R.id.ed14);
        e15=(EditText)view.findViewById(R.id.ed15);
        e16=(EditText)view.findViewById(R.id.ed16);
        e17=(EditText)view.findViewById(R.id.ed17);
        e18=(EditText)view.findViewById(R.id.ed18);
        e19=(EditText)view.findViewById(R.id.ed19);
        e20=(EditText)view.findViewById(R.id.ed20);
        e21=(EditText)view.findViewById(R.id.ed21);
        e22=(EditText)view.findViewById(R.id.ed22);
        e23=(EditText)view.findViewById(R.id.ed23);
        e24=(EditText)view.findViewById(R.id.ed24);
        kl=getActivity().getSharedPreferences("data", Context.MODE_PRIVATE);
        e1.setText(kl.getString("MOTOR CYCLE LESS THAN 50CC(MC50CC)","abc"));
        e2.setText(kl.getString("MOTOR CYCLE WITHOUT GEAR(NON TRANSPORT)(MCWOG)","abc"));
        e3.setText(kl.getString("MOTOR CYCLE WITH GEAR(NON TRANSPORT)(MCWG)","abc"));
        e4.setText(kl.getString("LMV-NT-Car(LMV)","abc"));
        e5.setText(kl.getString("LMV  -TRACTOR-NT(TRCTOR)","abc"));
        e6.setText(kl.getString("LMV(TRANSPORT(LMV GV))","abc"));
        e7.setText(kl.getString("LMV -3 WHEELER CAB(3W-CAB)","abc"));
        e8.setText(kl.getString("LMV -3 WHEELER TRANSPORT GOODS NON PSV(3W-GV)","abc"));
        e9.setText(kl.getString("INVALID CARRIAGE VEHICLE(INVCRG)","abc"));
        e10.setText(kl.getString("ROAD ROLLER(RDRLR)","abc"));
        e11.setText(kl.getString("OTHER OTHERS(OTHER)","abc"));
        e12.setText(kl.getString("OTHERS-LOADER/EXCAVATOR(LDRXCV)","abc"));
        e13.setText(kl.getString("OTHERS-CRANES(CRANE)","abc"));
        e14.setText(kl.getString("OTHERS-ForkliftT(FLIFT)","abc"));
        e15.setText(kl.getString("OTHERS-BORING RIGG(BRIGS)","abc"));
        e16.setText(kl.getString("OTHERS-Construction Equipments(CNEQP)","abc"));
        e17.setText(kl.getString("Invalid Carriage-2nd Vehicle(INVCG2)","abc"));
        e18.setText(kl.getString("Invalid Carriage-3rd Vehicle(INVCG3)","abc"));
        e19.setText(kl.getString("E-CART (eCART)","abc"));
        e20.setText(kl.getString("E-RIKSHAW(eRIKSH)","abc"));
        e21.setText(kl.getString("(PLEASE TICK IF YES)","abc"));
        e22.setText(kl.getString("YES I AM","abc"));
        e23.setText(kl.getString("PLEASE TICK IF WILLING","abc"));
        e24.setText(kl.getString("YES","abc"));
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    boolean l=db.insertDataUd(
                            kl.getString("state","abc"),kl.getString("rto_office","abc"),kl.getString("pincode","abc"),
                            kl.getString("applicant_name","abc"),kl.getString("relation","abc"),kl.getString("relation_name","abc"),
                            kl.getString("adhar_no","abc"), kl.getString("gender","abc"), kl.getString("dob","abc"),
                            kl.getString("qualification","abc"), kl.getString("blood_group","abc"), kl.getString("phone_no","abc"),
                            kl.getString("mail_id","abc"),kl.getString("mobile_no","abc"),
                           // kl.getString("VillageOrTown","abc"),
                            kl.getString("VillageOrTownName","abc"),
                            kl.getString("doorNo","abc"),kl.getString("localityNo","abc"),
                            kl.getString("LoactionName","abc"),kl.getString("pincode_address","abc"),
                            kl.getString("MOTOR CYCLE LESS THAN 50CC(MC50CC)","abc"),kl.getString("MOTOR CYCLE WITHOUT GEAR(NON TRANSPORT)(MCWOG)","abc"),
                            kl.getString("MOTOR CYCLE WITH GEAR(NON TRANSPORT)(MCWG)","abc"),kl.getString("LMV-NT-Car(LMV)","abc"),
                            kl.getString("LMV  -TRACTOR-NT(TRCTOR)","abc"),kl.getString("LMV(TRANSPORT(LMV GV))","abc"),kl.getString("LMV -3 WHEELER CAB(3W-CAB)","abc"),
                            kl.getString("LMV -3 WHEELER TRANSPORT GOODS NON PSV(3W-GV)","abc"),kl.getString("INVALID CARRIAGE VEHICLE(INVCRG)","abc"),
                            kl.getString("ROAD ROLLER(RDRLR)","abc"),kl.getString("OTHER OTHERS(OTHER)","abc"),kl.getString("OTHERS-LOADER/EXCAVATOR(LDRXCV)","abc"),
                            kl.getString("OTHERS-CRANES(CRANE)","abc"),kl.getString("OTHERS-ForkliftT(FLIFT)","abc"),kl.getString("OTHERS-BORING RIGG(BRIGS)","abc"),
                            kl.getString("OTHERS-Construction Equipments(CNEQP)","abc"),kl.getString("Invalid Carriage-2nd Vehicle(INVCG2)","abc"),kl.getString("Invalid Carriage-3rd Vehicle(INVCG3)","abc"),
                            kl.getString("E-CART (eCART)","abc"),kl.getString("E-RIKSHAW(eRIKSH)","abc"),kl.getString("(PLEASE TICK IF YES)","abc"),
                            kl.getString("YES I AM","abc"),kl.getString("PLEASE TICK IF WILLING","abc"),kl.getString("YES","abc")

                    );
                if(l){
                    Toast.makeText(getContext(), "sucessfull", Toast.LENGTH_SHORT).show();
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frag1,new DisplayTimeSlot(),new DisplayTimeSlot().getTag()).commit();

                }
                else{ Toast.makeText(getContext(), "failed", Toast.LENGTH_SHORT).show();}
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frag1,new BlankFragment(),new BlankFragment().getTag()).commit();

            }
        });

        return view;
    }

}
