package com.example.ammar.dnevnik;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by acer on 22.5.2016..
 */
public class Izbornik {
    /*Klasa služi za spremanje podataka u memoriju i biti će spremljene bez obzira što se s aktivnostima i fragmentima dogodi*/
    private ArrayList<Izbor> mIzbor;
    private static Izbornik mIzbornik;
    private Context mIzborContext;

    private Izbornik(Context izborContext){
        mIzborContext = izborContext;
        mIzbor = new ArrayList<Izbor>();
        for (int i=0;i<4;i++){
            Izbor c = new Izbor();
            c.setTitle("Izbor #"+i);
            mIzbor.add(c);
        }
    }

    public static Izbornik get(Context c){
        if(mIzbornik == null){
            mIzbornik = new Izbornik(c.getApplicationContext());
        }
        return mIzbornik;
    }
    public ArrayList<Izbor> getIzbor(){
        return mIzbor;
    }
    public Izbor getIzbor(UUID id){
        for(Izbor c : mIzbor){
            if(c.getId().equals(id))
                return c;
        }
        return null;
    }
}
