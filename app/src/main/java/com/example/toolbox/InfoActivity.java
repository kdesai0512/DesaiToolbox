package com.example.toolbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class InfoActivity extends AppCompatActivity {

    public static final String MY_NAME = "name";
    private String science;
    private String math;
    private String history;
    private String english;
    private String art;
    private String music;
    private String comp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.science:
                if (checked)
                    science = "science homework";
        }
    }

    public void onCheckbox2Clicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.math:
                if (checked)
                    math = "math homework";
        }
    }

    public void onCheckbox3Clicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.history:
                if (checked)
                    history = "history homework";
        }
    }

    public void onCheckbox4Clicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.english:
                if (checked)
                    english = "english homework";
        }
    }

    public void onCheckbox5Clicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.art:
                if (checked)
                    art = "art homework";
        }
    }

    public void onCheckbox6Clicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.music:
                if (checked)
                    music = "music homework";
        }
    }

    public void onCheckbox7Clicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.comp:
                if (checked)
                    comp = "computer science homework";
        }
    }

    public void generate(View v) {


        Intent intent = new Intent(this, Info2Activity.class);

        intent.putExtra(Info2Activity.MY_SCIENCE, science);
        intent.putExtra(Info2Activity.MY_MATH, math);
        intent.putExtra(Info2Activity.MY_HISTORY, history);
        intent.putExtra(Info2Activity.MY_ENGLISH, english);
        intent.putExtra(Info2Activity.MY_ART, art);
        intent.putExtra(Info2Activity.MY_MUSIC, music);
        intent.putExtra(Info2Activity.MY_COMP, comp);

        startActivity(intent);

    }







}
