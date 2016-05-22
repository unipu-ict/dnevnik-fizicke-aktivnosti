package com.example.ammar.dnevnik;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by acer on 22.5.2016..
 */
public class Izbornik {
    /*Klasa služi za spremanje podataka u memoriju i biti će spremljene bez obzira što se s aktivnostima i fragmentima dogodi*/
    private ArrayList<MainActivity> mIzbor;
    private static Izbornik mIzbornik;
    private Context mIzborContext;

    private Izbornik(Context izborContext){
        mIzborContext = izborContext;
        mIzbor = new ArrayList<MainActivity>();
    }

    public static Izbornik get(Context c){
        if(mIzbornik == null){
            mIzbornik = new Izbornik(c.getApplicationContext());
        }
        return mIzbornik;
    }
    public ArrayList<MainActivity> getIzbor(){
        return mIzbor;
    }
}
