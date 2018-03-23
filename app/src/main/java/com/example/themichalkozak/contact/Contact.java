package com.example.themichalkozak.contact;


import android.os.Parcel;
import android.os.Parcelable;


/**
 * Created by themichalkozak on 21/03/2018.
 */

public class Contact implements Parcelable {

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

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }

    Contact(Parcel in) {
        this.myName = in.readString();
        this.myPhoneNumber = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(myName);
        dest.writeString(myPhoneNumber);
    }

    public static final Parcelable.Creator<Contact> CREATOR
            = new Parcelable.Creator<Contact>() {
        public Contact createFromParcel(Parcel in) {
            return new Contact(in);
        }

        public Contact[] newArray(int size) {
            return new Contact[size];

            }
        };


    @Override
    public int describeContents() {
        return 0;

    }
}


