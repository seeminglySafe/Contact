package com.example.themichalkozak.contact;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by themichalkozak on 21/03/2018.
 */

public class ContactAdapter extends ArrayAdapter<Contact> {

    private static final String LOG_TAG = ContactAdapter.class.getSimpleName();

    public ContactAdapter(Activity context,ArrayList<Contact> contact) {
        super(context, 0, contact);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.contact_list,parent,false);
        }

        Contact currentContact = getItem(position);

        TextView contactName = (TextView) listItemView.findViewById(R.id.contact_name);
        contactName.setText(currentContact.getMyName());

        TextView contactNumber = (TextView) listItemView.findViewById(R.id.contact_number);
        contactNumber.setText(currentContact.getMyPhoneNumber());



        return listItemView;
    }
}
