package com.pazyogevcalc.student.messagetimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityCall extends AppCompatActivity implements View.OnClickListener{
    protected static final int ROOT_CODE=10;
    Button  Clockset;
    EditText phone,reminder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

      Clockset=(Button) findViewById(R.id. Clockset);
        Clockset.setOnClickListener(this);

        phone=(EditText)findViewById(R.id.phonenumber);
        phone.setOnClickListener(this);

        reminder=(EditText)findViewById(R.id.reminder);
        reminder.setOnClickListener(this);



    }

    public void onClick(View v) {
        if(v==Clockset) {
            Intent intent = new Intent(this, Clock.class);
            startActivityForResult( intent , ROOT_CODE);
        }
    }


    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK && requestCode == ROOT_CODE) {

        } else {

            Toast.makeText(getApplicationContext(), "Time Not Set", Toast.LENGTH_LONG);
        }
    }

    }

