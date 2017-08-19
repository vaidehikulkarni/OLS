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
public class Fragment3 extends Fragment {

CheckBox c1,c2;
    public Fragment3() {
        // Required empty public constructor
    }
Button b1,b2,b3;
SharedPreferences kl;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment3, container, false);
        c1=(CheckBox)view.findViewById(R.id.chkbx1);
        c2=(CheckBox)view.findViewById(R.id.checkboxyes);
        b1=(Button)view.findViewById(R.id.bt5);
        final String y="yes",n="no";
        kl=getActivity().getSharedPreferences("data", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor=kl.edit();

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
               editor.apply();
                Toast.makeText(getContext(), "forwarded to next", Toast.LENGTH_SHORT).show();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frag1,new Fragment4(),new Fragment4().getTag()).commit();
            }
        });
        b2=(Button)view.findViewById(R.id.bt6);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frag1,new Fragment3(),new Fragment3().getTag()).commit();
            }
        });
        b3=(Button)view.findViewById(R.id.bt7);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(),MainActivity.class));
            }
        });
        return  view;
    }

}
