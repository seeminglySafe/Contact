package com.example.themichalkozak.contact;

import java.util.logging.StreamHandler;

/**
 * Created by themichalkozak on 21/03/2018.
 */

public class Contact {

    private String myName;
    private String myPhoneNumber;

    public Contact(String myName, String myPhoneNumber) {
        this.myName = myName;
        this.myPhoneNumber = myPhoneNumber;
    }

    public String getMyName() {
        return myName;
    }

    public String getMyPhoneNumber() {
        return myPhoneNumber;
    }

    public Contact createNewContact(String myName, String myPhoneNumber){
        return new Contact(myName,myPhoneNumber);
    }
}
