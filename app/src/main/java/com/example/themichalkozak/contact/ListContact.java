package com.example.themichalkozak.contact;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class ListContact extends AppCompatActivity {

    private static final String CONTACT_LIST = "CONTACT_LIST" ;
    ArrayList<Contact> arrayList;
    public int test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_list);


        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        Log.i("asdad","asdasd");

        if (bundle != null) {

            arrayList = bundle.getParcelableArrayList(CONTACT_LIST);
            test = bundle.getInt("TEST");

            Contact contact = arrayList.get(0);
            Log.i("ListCntact"," " + contact.getMyName());
            Log.i("ListCntact"," " + test);

        }

        ContactAdapter contactAdapter = new ContactAdapter(this,arrayList);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(contactAdapter);

    }


}

