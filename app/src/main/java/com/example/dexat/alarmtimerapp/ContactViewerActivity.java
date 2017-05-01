package com.example.dexat.alarmtimerapp;

import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.provider.ContactsContract;

public class ContactViewerActivity extends AppCompatActivity {
    private final static String LOGTAG = "ContactViewerActivity";
    static final int REQUEST_SELECT_CONTACT = 1;
    private TextView contactName;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOGTAG, "...onCreate...");
        setContentView(R.layout.contact_viewer_activity);
        contactName = (TextView) findViewById(R.id.contactResult);

    }

    protected void onSearchContactClick (View view) {
        Log.d(LOGTAG, "...onSearchContactClick...");
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, REQUEST_SELECT_CONTACT);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Log.d(LOGTAG, "...onActivityResult..." + "requestCode" + requestCode + "resultCode" + resultCode);
        if (requestCode == REQUEST_SELECT_CONTACT && resultCode == RESULT_OK) {
            Uri contactUri = data.getData();
            Cursor cursor = getContentResolver().query(contactUri, null, null, null, null);
            if (cursor.moveToFirst()) {
                int idx = cursor.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME);
                String name = cursor.getString(idx);
                contactName.setText(name);
            }
        }
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
