package com.example.themichalkozak.contact;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class AddContact extends AppCompatActivity {


    EditText myName;
    EditText myNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        myName =  findViewById(R.id.name_editText);
        myNumber = findViewById(R.id.number_EditText);

        findViewById(R.id.confirm_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("AddActivity", "Ok button clicked");

                finish();
            }
        });

    }

    @Override
    public void finish() {
        Intent intent = new Intent();

        intent.putExtra("eldo", "CONTACT_NAME");

        setResult(RESULT_OK, intent);
        super.finish();
    }
}
