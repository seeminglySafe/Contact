package com.example.themichalkozak.contact;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String CONTACT_LIST = "CONTACT_LIST";
    public static ContactArrayList contactArrayList = new ContactArrayList("Michal");
    ArrayList<Contact> newContactArray = contactArrayList.getContactArrayList();
    public static int SUB_ACTIVITY_ADD_CONTACT = 1;
    public static int SUB_ACTIVITY_LIST = 1;
    public int test =1;


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

        findViewById(R.id.list_contact_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listContactIntent = new Intent(MainActivity.this,ListContact.class);
                listContactIntent.putParcelableArrayListExtra(CONTACT_LIST,newContactArray);
                listContactIntent.putExtra("TEST",test);
                Log.i("OnClick List"," " + newContactArray.get(0));
                Contact contact = newContactArray.get(0);
                Log.i("OnClick",contact.getMyName());
                startActivityForResult(listContactIntent,SUB_ACTIVITY_LIST);
            }
        });


    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == SUB_ACTIVITY_ADD_CONTACT && resultCode == Activity.RESULT_OK) {
            Bundle extras = data.getExtras();
            if (extras != null) {
                String myName = extras.getString("CONTACT_NAME");
                String myNumber = extras.getString("CONTACT_NUMBER");

                Log.i("onActivityResult", " " + myName + myNumber);

                addContact(myName,myNumber);
            }
        }
    }

    public void addContact(String myName, String myNumber){

        Contact contact = Contact.createContact(myName,myNumber);

        newContactArray.add(contact);

    }
}

