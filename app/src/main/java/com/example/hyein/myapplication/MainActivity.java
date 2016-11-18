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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup animal;
    TextView textView;
    RadioButton dog, cat, rabbit;
    Button end;
    CheckBox checkBox;
    ImageView imageView;
    LinearLayout linear1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        checkBox = (CheckBox) findViewById(R.id.checkBox);
        animal = (RadioGroup) findViewById(R.id.animal);
        end = (Button) findViewById(R.id.end);
        imageView = (ImageView) findViewById(R.id.imageView);
        linear1 = (LinearLayout) findViewById(R.id.linear1);


        checkBox.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {
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
                if (animal.getCheckedRadioButtonId() == R.id.dog) {
                    imageView.setImageResource(R.drawable.dog);
                } else if (animal.getCheckedRadioButtonId() == R.id.cat) {
                    imageView.setImageResource(R.drawable.cat);
                } else {
                    imageView.setImageResource(R.drawable.rabbit);
                }
            }
        });
    }
}

