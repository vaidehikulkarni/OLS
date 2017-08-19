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


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment4 extends Fragment {
    SharedPreferences kl;
EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,e19,e20;
    //    e21,e22,e23,e24,e25,e26,e27,e28,e29,e30,e31,e32,e33,e34,e35,e36,e37,e38,e39,e40,e41,e42,e43,e44;
    public Fragment4() {
        // Required empty public constructor
    }

Button b1,b2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment5, container, false);
        b1=(Button)view.findViewById(R.id.submitt);
        b2=(Button)view.findViewById(R.id.back);

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
    /*    e21=(EditText)view.findViewById(R.id.ed21);
        e22=(EditText)view.findViewById(R.id.ed22);
        e23=(EditText)view.findViewById(R.id.ed23);
        e24=(EditText)view.findViewById(R.id.ed24);
        e25=(EditText)view.findViewById(R.id.ed25);
        e26=(EditText)view.findViewById(R.id.ed26);
        e27=(EditText)view.findViewById(R.id.ed27);
        e28=(EditText)view.findViewById(R.id.ed28);
        e29=(EditText)view.findViewById(R.id.ed29);
        e30=(EditText)view.findViewById(R.id.ed30);
        e31=(EditText)view.findViewById(R.id.ed31);
        e32=(EditText)view.findViewById(R.id.ed32);
        e33=(EditText)view.findViewById(R.id.ed33);
        e34=(EditText)view.findViewById(R.id.ed34);
        e35=(EditText)view.findViewById(R.id.ed35);
        e36=(EditText)view.findViewById(R.id.ed36);
        e37=(EditText)view.findViewById(R.id.ed37);
        e38=(EditText)view.findViewById(R.id.ed38);
        e39=(EditText)view.findViewById(R.id.ed39);
        e40=(EditText)view.findViewById(R.id.ed40);
        e41=(EditText)view.findViewById(R.id.ed41);
        e42=(EditText)view.findViewById(R.id.ed42);
        e43=(EditText)view.findViewById(R.id.ed43);
        e44=(EditText)view.findViewById(R.id.ed44);*/
       // e41=(EditText)view.findViewById(R.id.ed41);
        //e42=(EditText)view.findViewById(R.id.ed42);

        kl=getActivity().getSharedPreferences("data", Context.MODE_PRIVATE);
        e1.setText(kl.getString("applicant_name","abc"));
        e2.setText(kl.getString("dob","abc"));
        e3.setText(kl.getString("blood_group","abc"));
        e4.setText(kl.getString("adhar_no","abc"));
        e5.setText(kl.getString("gender","abc"));
        e6.setText(kl.getString("state","abc"));
        e7.setText(kl.getString("relation","abc"));
        e8.setText(kl.getString("relation_name","abc"));
        e9.setText(kl.getString("qualification","abc"));
        e10.setText(kl.getString("phone_no","abc"));
        e11.setText(kl.getString("mobile_no","abc"));
        e12.setText(kl.getString("mail_id","abc"));
        e13.setText(kl.getString("rto_office","abc"));
        e14.setText(kl.getString("pincode","abc"));
        e15.setText(kl.getString("VillageOrTown","abc"));
        e16.setText(kl.getString("VillageOrTownName","abc"));
        e17.setText(kl.getString("doorNo","abc"));
        e18.setText(kl.getString("localityNo","abc"));
        e19.setText(kl.getString("LoactionName","abc"));
        e20.setText(kl.getString("pincode_address","abc"));

      /*  e21.setText(kl.getString("MOTOR CYCLE LESS THAN 50CC(MC50CC)","abc"));
        e22.setText(kl.getString("MOTOR CYCLE WITHOUT GEAR(NON TRANSPORT)(MCWOG)","abc"));
        e23.setText(kl.getString("MOTOR CYCLE WITH GEAR(NON TRANSPORT)(MCWG)","abc"));
        e24.setText(kl.getString("LMV-NT-Car(LMV)","abc"));
        e25.setText(kl.getString("LMV  -TRACTOR-NT(TRCTOR)","abc"));
        e26.setText(kl.getString("LMV(TRANSPORT(LMV GV))","abc"));
        e27.setText(kl.getString("LMV -3 WHEELER CAB(3W-CAB)","abc"));
        e28.setText(kl.getString("LMV -3 WHEELER TRANSPORT GOODS NON PSV(3W-GV)","abc"));
        e29.setText(kl.getString("INVALID CARRIAGE VEHICLE(INVCRG)","abc"));
        e30.setText(kl.getString("ROAD ROLLER(RDRLR","abc"));
        e31.setText(kl.getString("OTHER OTHERS(OTHER)","abc"));
        e32.setText(kl.getString("OTHERS-LOADER/EXCAVATOR(LDRXCV)","abc"));
        e33.setText(kl.getString("OTHERS-CRANES(CRANE)","abc"));
        e34.setText(kl.getString("OTHERS-ForkliftT(FLIFT)","abc"));
        e35.setText(kl.getString("OTHERS-BORING RIGG(BRIGS)","abc"));
        e36.setText(kl.getString("OTHERS-Construction Equipments(CNEQP)","abc"));
        e37.setText(kl.getString("Invalid Carriage-2nd Vehicle(INVCG2)","abc"));
        e38.setText(kl.getString("Invalid Carriage-3rd Vehicle(INVCG3)","abc"));
        e39.setText(kl.getString("E-CART (eCART)","abc"));
        e40.setText(kl.getString("E-RIKSHAW(eRIKSH)","abc"));
        e41.setText(kl.getString("(PLEASE TICK IF YES)","abc"));
        e42.setText(kl.getString("YES I AM","abc"));
        e43.setText(kl.getString("PLEASE TICK IF WILLING","abc"));
        e44.setText(kl.getString("YES","abc")); */

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frag1,new Fragment5(),new Fragment5().getTag()).commit();

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
