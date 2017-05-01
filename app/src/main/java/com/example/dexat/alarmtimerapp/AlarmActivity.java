package com.example.dexat.alarmtimerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.provider.AlarmClock;


public class AlarmActivity  extends AppCompatActivity {
    private final static String LOGTAG = "AlarmActivity";


    private EditText hourWidget;
    private EditText minuteWidget;


    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarm_activity);
        hourWidget = (EditText) findViewById(R.id.hours);
        minuteWidget = (EditText) findViewById(R.id.minutes);

    }

    public void setAlarm(View view) {
        Log.d(LOGTAG, "...startTimer...");
        int hour = Integer.parseInt(hourWidget.getText().toString());
        Log.d(LOGTAG, "...gethour..." + hour);
        int minutes = Integer.parseInt(minuteWidget.getText().toString());
        Log.d(LOGTAG, "...getminutes..."+ minutes);
        Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_HOUR, hour)
                .putExtra(AlarmClock.EXTRA_MINUTES, minutes)
                .putExtra(AlarmClock.EXTRA_SKIP_UI, true);
        Log.d(LOGTAG, "...putExtraStartTimer...");
        if (intent.resolveActivity(getPackageManager()) != null) {
            Log.d(LOGTAG, "...startActivity...");
            startActivity(intent);
        }
        Log.d(LOGTAG, "...finishmethodSetAlarm...");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOGTAG, "...onStart...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOGTAG, "...onResume...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOGTAG, "...onPause...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOGTAG, "...onStop...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOGTAG, "...onDestroy...");
    }
}