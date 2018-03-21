package com.example.themichalkozak.contact;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class AddContact extends AppCompatActivity {

    public static ContactArrayList contactArrayList = new ContactArrayList("Eldo");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        final EditText myName = (EditText) findViewById(R.id.name_editText);
        final EditText myNumber = (EditText) findViewById(R.id.number_EditText);


        findViewById(R.id.confirm_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Contact contact = Contact.createContact(myName.getText().toString(),myNumber.getText().toString());
                contactArrayList.addContact(contact);
            }
        });
    }


}
