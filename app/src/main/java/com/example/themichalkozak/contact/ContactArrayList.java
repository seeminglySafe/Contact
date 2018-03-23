package com.example.themichalkozak.contact;


import java.util.ArrayList;

/**
 * Created by themichalkozak on 21/03/2018.
 */

public class ContactArrayList {

    private String name;
    private ArrayList<Contact> contactArrayList;

    public ContactArrayList(String name) {
        this.name = name;
        this.contactArrayList = new ArrayList<Contact>();
    }


    public ArrayList<Contact> getContactArrayList() {
        return contactArrayList;
    }

    public void addContact(Contact contact) {
        this.contactArrayList.add(contact);
    }
}