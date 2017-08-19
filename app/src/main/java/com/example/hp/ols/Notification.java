package com.example.hp.ols;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Notification extends AppCompatActivity {
TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        t1=(TextView)findViewById(R.id.date);
        t2=(TextView)findViewById(R.id.time);
        SharedPreferences kl=getSharedPreferences("data", Context.MODE_PRIVATE);
       String l= kl.getString("Date","abc");
        String p=kl.getString("Time","sdf");
        t1.setText(l);
        t2.setText(p);
    }

}
