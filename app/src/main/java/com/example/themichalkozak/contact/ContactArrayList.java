package com.example.themichalkozak.contact;

import java.util.ArrayList;

/**
 * Created by themichalkozak on 21/03/2018.
 */

public class ContactArrayList {

    private String myName;
    private ArrayList<Contact> contactArrayList;

    public ContactArrayList(String myName, ArrayList<Contact> contactArrayList) {
        this.myName = myName;
        this.contactArrayList = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact){
        if(findContact(contact)<0){
            return false;
        }
        this.contactArrayList.add(contact);
        return true;
    }

    private int findContact(Contact contact){
        return this.contactArrayList.indexOf(contact);
    }
}
