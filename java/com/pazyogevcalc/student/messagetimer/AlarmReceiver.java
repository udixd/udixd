package com.pazyogevcalc.student.messagetimer;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class AlarmReceiver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_receiver);
    }


    public void onReceive(Context context, Intent intent) {
//you can check the log that it is fired
//Here we are actually not doing anything
//but you can do any task here that you want to be done at a specific time everyday
// For our recurring task, we'll just display a message
        Toast.makeText(context, "I'm running", Toast.LENGTH_SHORT).show();
        Log.d("MyAlarmBelal", "Alarm just fired");
    }
}

