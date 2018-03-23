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
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putString("CONTACT_NAME",myName.getText().toString());
                bundle.putString("CONTACT_NUMBER",myNumber.getText().toString());
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);


                finish();
            }
        });

    }

}
