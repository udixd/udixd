package com.pazyogevcalc.student.messagetimer;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class Clock extends AppCompatActivity implements View.OnClickListener {
    TimePicker timePicker;
    Button cancel,set;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock);

        timePicker = (TimePicker) findViewById(R.id.timePicker);
        timePicker.setOnClickListener(this);

        cancel=(Button)findViewById(R.id.cancel);
        cancel.setOnClickListener(this);

        set=(Button)findViewById(R.id.btnAlarm);
        set.setOnClickListener(this);


    }

    public void onClick(View view) {

        if (view == timePicker) {
            Calendar calendar = Calendar.getInstance();
            if (android.os.Build.VERSION.SDK_INT >= 23) {
                calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH),
                        timePicker.getHour(), timePicker.getMinute(), 0);
            } else {
                calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH),
                        calendar.get(Calendar.DAY_OF_MONTH),
                        timePicker.getCurrentHour(), timePicker.getCurrentMinute(), 0);
            }
            setAlarm(calendar.getTimeInMillis());

        }

        if (view == set)
        {
            Intent data = new Intent();
        data.putExtra("day", "");
        setResult(RESULT_OK, data);
        finish();
    }

        if(view==cancel)
        {
            finish();

        }
    }


    private void setAlarm(long time) {
//getting the alarm manager
        AlarmManager am = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
//creating a new intent specifying the broadcast receiver
        Intent i = new Intent(this, AlarmReceiver.class);
//creating a pending intent using the intent
        PendingIntent pi = PendingIntent.getBroadcast(this, 0, i, 0);

        Toast.makeText(this, "Alarm is set", Toast.LENGTH_SHORT).show();
    }
}



