package com.example.toolbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class InfoActivity extends AppCompatActivity {

    public static final String MY_NAME = "name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }

    public void checked(View v) {
        CheckBox s = (CheckBox) findViewById(R.id.science);
        CheckBox m = (CheckBox) findViewById(R.id.math);
        CheckBox h = (CheckBox) findViewById(R.id.history);
        CheckBox e = (CheckBox) findViewById(R.id.english);
        CheckBox a = (CheckBox) findViewById(R.id.art);
        CheckBox u = (CheckBox) findViewById(R.id.music);
        CheckBox c = (CheckBox) findViewById(R.id.comp);

        if(s.isChecked()) {
            String science = "science homework";
        }

        if(m.isChecked()) {
            String math = "math homework";
        }

        if(h.isChecked()) {
            String history = "history homework";
        }

        if(e.isChecked()) {
            String english = "english homework";
        }

        if(a.isChecked()) {
            String art = "art homework";
        }

        if(u.isChecked()) {
            String music = "music homework";
        }

        if(c.isChecked()) {
            String comp = "computer science homework";
        }
    }


}
