package com.example.toolbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class Info2Activity extends AppCompatActivity {

    public static final String MY_SCIENCE = "";
    public static final String MY_MATH = "";
    public static final String MY_HISTORY = "";
    public static final String MY_ENGLISH = "";
    public static final String MY_ART = "";
    public static final String MY_MUSIC = "";
    public static final String MY_COMP = "";
    private String message = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info2);
    }

    public void set(View v) {
        if (MY_SCIENCE.length() != 0)
            message += MY_SCIENCE + "\n";
        if (MY_MATH.length() != 0)
            message += MY_MATH + "\n";
    }







}
