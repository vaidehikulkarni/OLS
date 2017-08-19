package com.example.hp.ols;
import android.support.v7.app.AppCompatActivity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import static android.R.attr.fragment;
import static com.example.hp.ols.R.id.bt5;
//import static com.example.hp.ols.R.id.fragment2;

public class ScrollingActivity extends AppCompatActivity {

    Button bt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
     //   Intent intent=getIntent();

   /*   bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fragment1, new BlankFragment());
                ft.commit();
            }
        });*/
        getSupportFragmentManager().beginTransaction().replace(R.id.frag1,new BlankFragment(),new BlankFragment().getTag()).commit();


    }
}
