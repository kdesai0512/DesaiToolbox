package com.example.toolbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class InfoActivity extends AppCompatActivity {

    public static final String MY_NAME = "name";
    private String science = "";
    private String math = "";
    private String history = "";
    private String english = "";
    private String art = "";
    private String music = "";
    private String comp = "";
    private String firstActivity = "";
    private String secondActivity = "";
    private String thirdActivity = "";
    private String fourthActivity = "";
    private String fifthActivity = "";


    ImageView image;
    RadioButton radioButton1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

            addListenerOnButton();
            addListenerOnButton2();
            addListenerOnButton3();
            addListenerOnButton4();
            addListenerOnButton5();



        }
    public void addListenerOnButton() {
        image = (ImageView) findViewById(R.id.imageView);

        radioButton1 = (RadioButton) findViewById(R.id.radioButton);
        radioButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                image.setImageResource(R.drawable.vhappy_face);
                firstActivity = "";
            }

        });

    }

    public void addListenerOnButton2() {
        image = (ImageView) findViewById(R.id.imageView);

        radioButton1 = (RadioButton) findViewById(R.id.radioButton2);
        radioButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                image.setImageResource(R.drawable.happy_face);

                secondActivity = "1st activity";



            }

        });

    }

    public void addListenerOnButton3() {
        image = (ImageView) findViewById(R.id.imageView);

        radioButton1 = (RadioButton) findViewById(R.id.radioButton3);
        radioButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                image.setImageResource(R.drawable.meh_face);

                thirdActivity = "2nd activity";
            }

        });
    }

    public void addListenerOnButton4() {
        image = (ImageView) findViewById(R.id.imageView);

        radioButton1 = (RadioButton) findViewById(R.id.radioButton4);
        radioButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                image.setImageResource(R.drawable.ic_action_name);

                fourthActivity = "3rd activity";
            }

        });
    }

    public void addListenerOnButton5() {
        image = (ImageView) findViewById(R.id.imageView);

        radioButton1 = (RadioButton) findViewById(R.id.radioButton5);
        radioButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                image.setImageResource(R.drawable.dead_face);

                fifthActivity = "4th activity";
            }

        });
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.science:
                if (checked)
                    science = "Science homework";
        }
    }


    public void onCheckbox2Clicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.math:
                if (checked)
                    math = "Math homework";
        }
    }

    public void onCheckbox3Clicked(View view) {
        CheckBox checkBox = (CheckBox) findViewById(R.id.history);
        if(checkBox.isChecked()){
            history = "History homework";
        }
    }

    public void onCheckbox4Clicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.english:
                if (checked)
                    english = "English homework";
        }
    }

    public void onCheckbox5Clicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.art:
                if (checked)
                    art = "Art homework";
        }
    }

    public void onCheckbox6Clicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.music:
                if (checked)
                    music = "Music homework";
        }
    }

    public void onCheckbox7Clicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.comp:
                if (checked)
                    comp = "Computer science homework";
        }
    }








    public void generate(View v) {

        Switch sw = (Switch) findViewById(R.id.switch2);
        final Intent intent = new Intent(this, Info2Activity.class);

                if (!sw.isChecked()) {
                    Context context = getApplicationContext();
                    CharSequence text = "Please agree terms and conditions";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else {

                    intent.putExtra(Info2Activity.MY_SCIENCE, science);
                    intent.putExtra(Info2Activity.MY_MATH, math);
                    intent.putExtra(Info2Activity.MY_HISTORY, history);
                    intent.putExtra(Info2Activity.MY_ENGLISH, english);
                    intent.putExtra(Info2Activity.MY_ART, art);
                    intent.putExtra(Info2Activity.MY_MUSIC, music);
                    intent.putExtra(Info2Activity.MY_COMP, comp);
                    intent.putExtra(Info2Activity.ACTIVITY_1, firstActivity);
                    intent.putExtra(Info2Activity.ACTIVITY_2, secondActivity);
                    intent.putExtra(Info2Activity.ACTIVITY_3, thirdActivity);
                    intent.putExtra(Info2Activity.ACTIVITY_4, fourthActivity);
                    intent.putExtra(Info2Activity.ACTIVITY_5, fifthActivity);


                    startActivity(intent);
                }
            }






    }








