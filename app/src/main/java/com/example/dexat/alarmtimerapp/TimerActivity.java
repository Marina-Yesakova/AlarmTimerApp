package com.example.dexat.alarmtimerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.provider.AlarmClock;


public class TimerActivity  extends AppCompatActivity  {
    private final static String LOGTAG = "TimerActivity";

    private EditText secondsWidget;
    private EditText messageWidget;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOGTAG, "...onCreate...");
        setContentView(R.layout.timer_activity);
        secondsWidget = (EditText) findViewById(R.id.seconds);
        messageWidget = (EditText) findViewById(R.id.message);

    }

    public void startTimer(View view) {
        Log.d(LOGTAG, "...startTimer...");
        String message = messageWidget.getText().toString();
        Log.d(LOGTAG, "...getMessage...");
        int seconds = Integer.parseInt(secondsWidget.getText().toString());
        Log.d(LOGTAG, "...getSeconds...");
        Intent intent = new Intent(AlarmClock.ACTION_SET_TIMER)


                .putExtra(AlarmClock.EXTRA_MESSAGE, message)
                .putExtra(AlarmClock.EXTRA_LENGTH, seconds)
                .putExtra(AlarmClock.EXTRA_SKIP_UI, true);

        Log.d(LOGTAG, "...putExtraStartTimer...");
         if (intent.resolveActivity(getPackageManager()) != null) {
            Log.d(LOGTAG, "...startActivity...");
            startActivity(intent);
       }
        Log.d(LOGTAG, "...finishmethodstartTimer...");
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