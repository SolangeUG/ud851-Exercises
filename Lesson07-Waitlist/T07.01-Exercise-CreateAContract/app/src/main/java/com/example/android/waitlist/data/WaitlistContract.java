package com.example.android.waitlist.data;

import android.provider.BaseColumns;

public class WaitlistContract {

    /**
     * Private constructor to prevent someone from
     * accidentally instantiating the contract class
     */
    private WaitlistContract() {}

    // COMPLETED (1) Create an inner class named WaitlistEntry class that implements the BaseColumns interface

    /**
     * Inner class that defines the table contents
     */
    static final class WaitlistEntry implements BaseColumns {

        // COMPLETED (2) Inside create a static final members for the table name and each of the db columns
        // TABLE_NAME -> waitlist;
        // COLUMN_GUEST_NAME -> guestName
        // COLUMN_PARTY_SIZE -> partySize
        // COLUMN_TIMESTAMP -> timestamp

        static final String TABLE_NAME = "waitlist";
        static final String COLUMN_GUEST_NAME = "guestName";
        static final String COLUMN_PARTY_SIZE = "partySize";
        static final String COLUMN_TIMESTAMP = "timestamp";
    }




}
