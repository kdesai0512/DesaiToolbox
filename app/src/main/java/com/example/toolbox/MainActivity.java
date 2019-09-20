package com.example.toolbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.icu.text.IDNA;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner1;
    Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }





    public void begin(View v) {

        EditText myName = (EditText) findViewById(R.id.name);

        if (myName.length() == 0) {
            Context context = getApplicationContext();
            CharSequence text = "Please fill all blanks";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else {
            String myNameStr = myName.getText().toString();


            Intent intent = new Intent(this, InfoActivity.class);

            intent.putExtra(InfoActivity.MY_NAME, myNameStr);


            startActivity(intent);
        }
    }


}
