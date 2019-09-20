package com.example.toolbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Info2Activity extends AppCompatActivity {

    public static final String MY_SCIENCE = "science";
    public static final String MY_MATH = "math";
    public static final String MY_HISTORY = "history";
    public static final String MY_ENGLISH = "english";
    public static final String MY_ART = "art";
    public static final String MY_MUSIC = "music";
    public static final String MY_COMP = "comp";
    public static final String ACTIVITY_1 = "firstActivity";
    public static final String ACTIVITY_2 = "secondActivity";
    public static final String ACTIVITY_3 = "thirdActivity";
    public static final String ACTIVITY_4 = "fourthActivity";
    public static final String ACTIVITY_5 = "fifthActivity";
    public static final String MY_NAME = "name";

    private String message = "";
    Button button;
    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_info2);
        super.onCreate(savedInstanceState);



        button = (Button)findViewById(R.id.button);
        text=(TextView)findViewById(R.id.text);


    }



    public void onClick(View v) {
        Intent intent = getIntent();
        String science = intent.getStringExtra(MY_SCIENCE);
        String math = intent.getStringExtra(MY_MATH);
        String history = intent.getStringExtra(MY_HISTORY);
        String english = intent.getStringExtra(MY_ENGLISH);
        String art = intent.getStringExtra(MY_ART);
        String music = intent.getStringExtra(MY_MUSIC);
        String comp = intent.getStringExtra(MY_COMP);
        String firstActivity = intent.getStringExtra(ACTIVITY_1);
        String secondActivity = intent.getStringExtra(ACTIVITY_2);
        String thirdActivity = intent.getStringExtra(ACTIVITY_3);
        String fourthActivity = intent.getStringExtra(ACTIVITY_4);
        String fifthActivity = intent.getStringExtra(ACTIVITY_5);
        String name = intent.getStringExtra(MY_NAME);
        if (science.contains("homework"))
            message += science + "\n";
        if (math.contains("homework"))
            message += math + "\n";
        if (english.contains("homework"))
            message += english + "\n";
        if (history.contains("homework"))
            message += history + "\n";
        if (art.contains("homework"))
            message += art + "\n";
        if (music.contains("homework"))
            message += music + "\n";
        if (comp.contains("homework"))
            message += comp + "\n";
        if (firstActivity.contains("activity"))
            message += firstActivity + "\n";
        if (secondActivity.contains("activity"))
            message += secondActivity + "\n";
        if (thirdActivity.contains("activity"))
            message += thirdActivity + "\n";
        if (fourthActivity.contains("activity"))
            message += fourthActivity + "\n";
        if (fifthActivity.contains("activity"))
            message += fifthActivity + "\n";

        text.setText("To-Do List:\n\n" + message);

    }


}

