package com.example.ammar.dnevnik;

import java.util.UUID;

/**
 * Created by acer on 23.5.2016..
 */
public class Izbor {
    /* generiranje random id a preko uuid-a*/
    private UUID mId;
    private String mTitle;

    public Izbor(){
        mId=UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }
}
