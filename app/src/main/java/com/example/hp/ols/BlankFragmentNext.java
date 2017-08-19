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
public class BlankFragmentNext extends Fragment {
    Spinner spinner,spinner2,spinner3,spinner4;
   TextView t1;
    RadioButton r1,r2;
    public BlankFragmentNext() {
        // Required empty public constructor
    }
    DataBaseHelper myDB;DataBaseHelper2 myDB2;
Button b1,b2,b3;
RadioGroup gp,gp1;
    EditText ed1,ed2,ed3,ed4,ed5,ed8,ed9,ed10,ed11,ed12;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) { SharedPreferences kl;
        // Inflate the layout for this fragment
       final View view= inflater.inflate(R.layout.fragment_blank_fragment_next, container, false);
        myDB=new DataBaseHelper(getActivity());
        myDB2=new DataBaseHelper2(getActivity());
        t1=(TextView)view.findViewById(R.id.maha1);
        //spinner spindistrict
        //spinner spinsubdistrict
        gp=(RadioGroup)view.findViewById(R.id.rgroup) ;
        ed1=(EditText)view.findViewById(R.id.village);
        ed2=(EditText)view.findViewById(R.id.doorno);
        ed3=(EditText)view.findViewById(R.id.localityno);
        ed4=(EditText)view.findViewById(R.id.locationname);
        ed5=(EditText)view.findViewById(R.id.pincode_no);

        kl=getActivity().getSharedPreferences("data", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor=kl.edit();

        b1=(Button)view.findViewById(R.id.bt5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a=gp.getCheckedRadioButtonId();
                r1=(RadioButton)view.findViewById(a);

            /*   if(myDB2.insertDataUD(t1.getText().toString(),
                       spinner.getSelectedItem().toString(),spinner2.getSelectedItem().toString(),
                       r1.getText().toString(),ed1.getText().toString(),ed2.getText().toString(),ed3.getText().toString(),
                       ed4.getText().toString(),ed5.getText().toString()
                     ))
               {
                   Toast.makeText(getContext(), "inserted sucessfully", Toast.LENGTH_SHORT).show();
                   getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frag1,new FragmentCheck(),new FragmentCheck().getTag()).commit();

               }
                else
               {
                   Toast.makeText(getContext(), "insertion failed", Toast.LENGTH_SHORT).show();
               }
                            int a=r1.getCheckedRadioButtonId();
                h=(RadioButton)view.findViewById(a);
                k=h.getText().toString();

                boolean r= myDB.insertDat();
                if(r)
                { Toast.makeText(getActivity(),"data inserted successfully",Toast.LENGTH_LONG).show();
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frag1,new BlankFragmentNext(),new BlankFragmentNext().getTag()).commit();}
                else
                {Toast.makeText(getActivity(),"insertion failed", Toast.LENGTH_LONG).show();}
*/
                editor.putString("VillageOrTown",r1.getText().toString());
                editor.putString("VillageOrTownName",ed1.getText().toString());
                editor.putString("doorNo",ed2.getText().toString());
                editor.putString("localityNo",ed3.getText().toString());
                editor.putString("LoactionName",ed4.getText().toString());
                editor.putString("pincode_address",ed5.getText().toString());

                editor.apply();
                Toast.makeText(getActivity(),"forwarded to next",Toast.LENGTH_LONG).show();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frag1,new FragmentCheck(),new FragmentCheck().getTag()).commit();
        }
        });
        b2=(Button)view.findViewById(R.id.bt6);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frag1,new BlankFragmentNext(),new BlankFragmentNext().getTag()).commit();
              }
        });
        b3=(Button)view.findViewById(R.id.bt7);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(),MainActivity.class));
            }
        });



        spinner=(Spinner) view.findViewById(R.id.spindistrict);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(getActivity(),R.array.districtlist,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);



        spinner2=(Spinner) view.findViewById(R.id.spinsubdistrict);

        ArrayAdapter<CharSequence> adapter2=ArrayAdapter.createFromResource(getActivity(),R.array.subdistrict_aurangabad,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

     /*   spinner3=(Spinner) view.findViewById(R.id.spinper);
        ArrayAdapter<CharSequence> adapter3=ArrayAdapter.createFromResource(getActivity(),R.array.districtlist,android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);


        spinner4=(Spinner) view.findViewById(R.id.spin2per);

        ArrayAdapter<CharSequence> adapter4=ArrayAdapter.createFromResource(getActivity(),R.array.subdistrict_aurangabad,android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter4);*/
        return view;

    }

}
