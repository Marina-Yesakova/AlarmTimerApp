package com.example.dexat.alarmtimerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private final static String LOGTAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOGTAG, "...onCreate...");
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.d(LOGTAG, "...onSaveInstanceState...");
    }

    // onClick gets called when the button is clicked on. Log.d call in the onClick handler so that it outputs a string to logcat
    protected void onTimerButtonClick(View v) {
        Log.d(LOGTAG, "...onTimerButtonClick...");
        // When you want an activity to start a second activity, use an intent.
        // An intent isan "intent to do something". It's a message that you
        // send to Android, stating that you want another activity started.
        Intent intent = new Intent(this, TimerActivity.class);
        Log.d(LOGTAG, "...createdIntent...");
        startActivity(intent);
        Log.d(LOGTAG, "...startedTimerActivity...");
    }

    // onClick gets called when the button is clicked on. Log.d call in the onClick handler so that it outputs a string to logcat
    protected void onSearchContactButtonClick(View v) {
        Log.d(LOGTAG, "...onSearchContactButtonClick...");
        // When you want an activity to start a second activity, use an intent.
        // An intent isan "intent to do something". It's a message that you
        // send to Android, stating that you want another activity started.
        Intent intent = new Intent(this, ContactViewerActivity.class);
        startActivity(intent);
    }
    // onClick gets called when the button is clicked on. Log.d call in the onClick handler so that it outputs a string to logcat
    protected void onAlarmButtonClick(View v) {
        Log.d(LOGTAG, "...onAlarmButtonClick...");
        // When you want an activity to start a second activity, use an intent.
        // An intent isan "intent to do something". It's a message that you
        // send to Android, stating that you want another activity started.
        Intent intent = new Intent(this, AlarmActivity.class);
        startActivity(intent);
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
