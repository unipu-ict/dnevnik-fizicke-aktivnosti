package com.example.ammar.dnevnik;

/**
 * Created by acer on 23.5.2016..
 */
public class Izbor {
    private int id;
    private String izbor;
    private String selektiranizbor;

    public Izbor(int id, String izbor) {
        this.id = id;
        this.izbor = izbor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIzbor() {
        return izbor;
    }

    public void setIzbor(String izbor) {
        this.izbor = izbor;
    }

    public String getSelektiranizbor() {
        return selektiranizbor;
    }

    public void setSelektiranizbor(String selektiranizbor) {
        this.selektiranizbor = selektiranizbor;
    }
}
