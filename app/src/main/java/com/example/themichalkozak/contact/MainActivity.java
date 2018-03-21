package com.example.themichalkozak.contact;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ContactArrayList contactArrayList = new ContactArrayList("yo");
    public static int SUB_ACTIVITY_ADD_CONTACT = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.add_contact_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddContact.class);

                startActivityForResult(intent, SUB_ACTIVITY_ADD_CONTACT);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == SUB_ACTIVITY_ADD_CONTACT && requestCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            if (extras != null) {
                String test = extras.getString("CONTACT_NAME");
                Log.i("elod", "" + test);
            }


        }

    }
}

