package com.example.hp.ols;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentCheck extends Fragment {
DataBaseHelper Db;
CheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22;
    public FragmentCheck() {
        // Required empty public constructor
    }
    String ch[];
Button b1,b2,b3;
SharedPreferences kl;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment_check, container, false);
       Db=new DataBaseHelper(getActivity());
        b1=(Button)view.findViewById(R.id.btsubmit);
        kl=getActivity().getSharedPreferences("data", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor=kl.edit();
        b2=(Button)view.findViewById(R.id.btrefresh);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frag1,new FragmentCheck(),new FragmentCheck().getTag()).commit();
            }
        });
        b3=(Button)view.findViewById(R.id.btcancel);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(),MainActivity.class));
            }
        });
        c1=(CheckBox)view.findViewById(R.id.checkboxclass1);
        c2=(CheckBox)view.findViewById(R.id.checkboxclass2);
        c3=(CheckBox)view.findViewById(R.id.checkboxclass3);
        c4=(CheckBox)view.findViewById(R.id.checkboxclass4);
        c5=(CheckBox)view.findViewById(R.id.checkboxclass5);
        c6=(CheckBox)view.findViewById(R.id.checkboxclass6);
        c7=(CheckBox)view.findViewById(R.id.checkboxclass7);
        c8=(CheckBox)view.findViewById(R.id.checkboxclass8);
        c9=(CheckBox)view.findViewById(R.id.checkboxclass9);
        c10=(CheckBox)view.findViewById(R.id.checkboxclass10);
        c11=(CheckBox)view.findViewById(R.id.checkboxclass11);
        c12=(CheckBox)view.findViewById(R.id.checkboxclass12);
        c13=(CheckBox)view.findViewById(R.id.checkboxclass13);
        c14=(CheckBox)view.findViewById(R.id.checkboxclass14);
        c15=(CheckBox)view.findViewById(R.id.checkboxclass15);
        c16=(CheckBox)view.findViewById(R.id.checkboxclass16);
        c17=(CheckBox)view.findViewById(R.id.checkboxclass17);
        c18=(CheckBox)view.findViewById(R.id.checkboxclass18);
        c19=(CheckBox)view.findViewById(R.id.checkboxclass19);
        c20=(CheckBox)view.findViewById(R.id.checkboxclass20);
        c21=(CheckBox)view.findViewById(R.id.checkboxstring1);
        c22=(CheckBox)view.findViewById(R.id.checkboxstring2);

final String y="yes",n="no";


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(c1.isChecked()){
                    editor.putString(c1.getText().toString(),y);
                }
                else{
                    editor.putString(c1.getText().toString(),n);
                }
                if(c2.isChecked()){
                    editor.putString(c2.getText().toString(),y);
                }
                else{
                    editor.putString(c2.getText().toString(),n);
                }
                if(c3.isChecked()){
                    editor.putString(c3.getText().toString(),y);
                }
                else{
                    editor.putString(c3.getText().toString(),n);
                }
                if(c4.isChecked()){
                    editor.putString(c4.getText().toString(),y);
                }
                else{
                    editor.putString(c4.getText().toString(),n);
                }
                if(c5.isChecked()){
                    editor.putString(c5.getText().toString(),y);
                }
                else{
                    editor.putString(c5.getText().toString(),n);
                }
                if(c6.isChecked()){
                    editor.putString(c6.getText().toString(),y);
                }
                else{
                    editor.putString(c6.getText().toString(),n);
                }
                if(c7.isChecked()){
                    editor.putString(c7.getText().toString(),y);
                }
                else{
                    editor.putString(c7.getText().toString(),n);
                }
                if(c8.isChecked()){
                    editor.putString(c8.getText().toString(),y);
                }
                else{
                    editor.putString(c8.getText().toString(),n);
                }
                if(c9.isChecked()){
                    editor.putString(c9.getText().toString(),y);
                }
                else{
                    editor.putString(c9.getText().toString(),n);
                }
                if(c10.isChecked()){
                    editor.putString(c10.getText().toString(),y);
                }
                else{
                    editor.putString(c10.getText().toString(),n);
                }
                if(c11.isChecked()){
                    editor.putString(c11.getText().toString(),y);
                }
                else{
                    editor.putString(c11.getText().toString(),n);
                }if(c12.isChecked()){
                    editor.putString(c12.getText().toString(),y);
                }
                else{
                    editor.putString(c12.getText().toString(),n);
                }if(c13.isChecked()){
                    editor.putString(c13.getText().toString(),y);
                }
                else{
                    editor.putString(c13.getText().toString(),n);
                }if(c14.isChecked()){
                    editor.putString(c14.getText().toString(),y);
                }
                else{
                    editor.putString(c14.getText().toString(),n);
                }if(c15.isChecked()){
                    editor.putString(c15.getText().toString(),y);
                }
                else{

                    editor.putString(c15.getText().toString(),n);
                }if(c16.isChecked()){
                    editor.putString(c16.getText().toString(),y);
                }
                else{

                }if(c17.isChecked()){
                    editor.putString(c17.getText().toString(),y);
                }
                else{
                    editor.putString(c17.getText().toString(),n);
                }if(c18.isChecked()){
                    editor.putString(c18.getText().toString(),y);
                }
                else{
                    editor.putString(c18.getText().toString(),n);
                }if(c19.isChecked()){
                    editor.putString(c19.getText().toString(),y);
                }
                else{
                    editor.putString(c19.getText().toString(),n);
                }if(c20.isChecked()){
                    editor.putString(c20.getText().toString(),y);
                }
                else{
                    editor.putString(c20.getText().toString(),n);
                }if(c21.isChecked()){
                    editor.putString(c21.getText().toString(),y);
                }
                else{
                    editor.putString(c21.getText().toString(),n);
                }if(c22.isChecked()){
                    editor.putString(c22.getText().toString(),y);
                }
                else{
                    editor.putString(c22.getText().toString(),n);
                }
                editor.apply();
                Toast.makeText(getActivity(),"forwarded to next",Toast.LENGTH_LONG).show();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frag1,new Fragment3(),new Fragment3().getTag()).commit();
            }
        });

        return view;
    }

}
