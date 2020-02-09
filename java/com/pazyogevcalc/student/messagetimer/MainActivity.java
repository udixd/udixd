package com.pazyogevcalc.student.messagetimer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button Calltimer, Emailtimer,Messagetimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calltimer=(Button) findViewById(R.id.Call);
        Emailtimer=(Button) findViewById(R.id.Email);
        Messagetimer=(Button) findViewById(R.id.Message);

        Calltimer.setOnClickListener(this);
        Emailtimer.setOnClickListener(this);
        Messagetimer.setOnClickListener(this);






    }


    public void openCall() {

        Intent intent = new Intent(this, ActivityCall.class);
        startActivity(intent);

    }
    public void openEmail() {

        Intent intent = new Intent(this, ActivityEmail.class);
        startActivity(intent);

    }
    public void openMessage() {

        Intent intent = new Intent(this, ActivityMessage.class);
        startActivity(intent);

    }

    @Override
    public void onClick(View v) {
        if(v==Calltimer)
            openCall();

        if(v==Emailtimer)
            openEmail();

        if(v==Messagetimer)
            openMessage();

    }
}
