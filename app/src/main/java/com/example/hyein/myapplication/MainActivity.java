package com.example.hyein.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup os;
    TextView textView;
    RadioButton android,jellybean,kit;
    Button end,first,exit;
    CheckBox checkBox;
    Switch switch1;
    ImageView imageView;
    LinearLayout linear1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch1 = (Switch) findViewById(R.id.switch1) ;
        //checkBox = (CheckBox) findViewById(R.id.checkBox);
        os = (RadioGroup) findViewById(R.id.os);
        end = (Button) findViewById(R.id.end);
        imageView = (ImageView) findViewById(R.id.imageView);
        linear1 = (LinearLayout) findViewById(R.id.linear1);
        first = (Button) findViewById(R.id.first);
        exit = (Button) findViewById(R.id.exit);
       // RadioButton = (RadioButton) findViewById(R.id.android);



        switch1.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener(){

                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        linear1.setVisibility(View.VISIBLE);
                    } else {
                        linear1.setVisibility(View.INVISIBLE);
                    }
                }


        });
        end.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (os.getCheckedRadioButtonId() == R.id.android) {
                    imageView.setImageResource(R.drawable.and);
                } else if (os.getCheckedRadioButtonId() == R.id.jellybean) {
                    imageView.setImageResource(R.drawable.jelly);
                } else {
                    imageView.setImageResource(R.drawable.kit);
                }
            }
        });
        first.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                linear1.setVisibility(View.INVISIBLE);
                switch1.setChecked(false);
            }
        });
        exit.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View v){
                finish();
            }
        });


    }
}

