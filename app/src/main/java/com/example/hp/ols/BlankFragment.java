package com.example.hp.ols;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
Button b1,b2,b3;RadioButton h;
    Spinner spinner3,spinner4,spinner5;
    public BlankFragment() {
        // Required empty public constructor
    }
    DataBaseHelper2 myDB;SharedPreferences kl;
TextView t1,t2;RadioGroup r1;
    EditText ed1,ed5,ed6,ed7,ed2,ed3,ed4,ed8,ed9,ed10,ed11,ed12;String k="";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       final View view= inflater.inflate(R.layout.fragment_blank, container, false);
        myDB=new DataBaseHelper2(getActivity());

        kl=getActivity().getSharedPreferences("data", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor=kl.edit();

        r1=(RadioGroup)view.findViewById(R.id.rgroup2);
        t1=(TextView)view.findViewById(R.id.maha);
        t2=(TextView)view.findViewById(R.id.abad);
        ed1=(EditText)view.findViewById(R.id.edit31);
        ed2=(EditText)view.findViewById(R.id.edit32);
        ed3=(EditText)view.findViewById(R.id.edit33);
        ed4=(EditText)view.findViewById(R.id.edit34);
        ed5=(EditText)view.findViewById(R.id.edit35);
        ed6=(EditText)view.findViewById(R.id.edit36);
        ed7=(EditText)view.findViewById(R.id.edit37);
        ed8=(EditText)view.findViewById(R.id.edit38);
       ed9=(EditText)view.findViewById(R.id.edit311);
        ed10=(EditText)view.findViewById(R.id.edit315);
        ed11=(EditText)view.findViewById(R.id.edit316);
        ed12=(EditText)view.findViewById(R.id.edit317);
        b1=(Button)view.findViewById(R.id.bt5);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=r1.getCheckedRadioButtonId();
                h=(RadioButton)view.findViewById(a);
                k=h.getText().toString();

           /*     boolean r= myDB.insertDataUd(t1.getText().toString(),t2.getText().toString(),ed1.getText().toString(),
                        ed2.getText().toString()+ed3.getText().toString()+ed4.getText().toString(),spinner3.getSelectedItem().toString(),
                        ed5.getText().toString()+ed6.getText().toString()+ed7.getText().toString(),ed8.getText().toString(),k,ed9.getText().toString(),
                        spinner4.getSelectedItem().toString(),spinner5.getSelectedItem().toString(),ed10.getText().toString(),
                        ed11.getText().toString(),ed12.getText().toString()
                        );
                if(r)
                { Toast.makeText(getActivity(),"data inserted successfully",Toast.LENGTH_LONG).show();
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frag1,new BlankFragmentNext(),new BlankFragmentNext().getTag()).commit();}
                else
                    {Toast.makeText(getActivity(),"insertion failed", Toast.LENGTH_LONG).show();}
*/
                editor.putString("state",t1.getText().toString());
                editor.putString("rto_office",t2.getText().toString());
                editor.putString("pincode",ed1.getText().toString());
                editor.putString("applicant_name",ed2.getText().toString()+" "+ed3.getText().toString()+" "+ed4.getText().toString());
                editor.putString("relation",spinner3.getSelectedItem().toString());
                editor.putString("relation_name",ed5.getText().toString()+" "+ed6.getText().toString()+" "+ed7.getText().toString());
                editor.putString("adhar_no",ed8.getText().toString());
                editor.putString("gender",k);
                editor.putString("dob",ed9.getText().toString());
                editor.putString("qualification",spinner4.getSelectedItem().toString());
                editor.putString("blood_group",spinner5.getSelectedItem().toString());
                editor.putString("phone_no",ed10.getText().toString());
                editor.putString("mail_id",ed11.getText().toString());
                editor.putString("mobile_no",ed12.getText().toString());

                editor.apply();
                Toast.makeText(getActivity(),"forwarded to next",Toast.LENGTH_LONG).show();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frag1,new BlankFragmentNext(),new BlankFragmentNext().getTag()).commit();

        }
        });
        b2=(Button)view.findViewById(R.id.bt6);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace
                        (R.id.frag1,new BlankFragmentNext(),new BlankFragmentNext().getTag()).commit();
            }
        });
        b3=(Button)view.findViewById(R.id.bt7);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               getActivity().startActivity(new Intent(getActivity(),MainActivity.class));
                 }
        });




        spinner3=(Spinner) view.findViewById(R.id.spin3);

        ArrayAdapter<CharSequence> adapter3=ArrayAdapter.createFromResource(getActivity(),R.array.spinner_relation,android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);


        spinner4=(Spinner) view.findViewById(R.id.spin4);

        ArrayAdapter<CharSequence> adapter4=ArrayAdapter.createFromResource(getActivity(),R.array.spinner_qualification,android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);



        spinner5=(Spinner) view.findViewById(R.id.spin5);

        ArrayAdapter<CharSequence> adapter5=ArrayAdapter.createFromResource(getActivity(),R.array.spinner_bg,android.R.layout.simple_spinner_item);
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(adapter5);


        return view;

    }
}
