package com.example.ammar.dnevnik;

import android.app.ListFragment;
import android.os.Bundle;

import java.util.ArrayList;

/**
 * Created by acer on 23.5.2016..
 */
public class IzborListFragment extends ListFragment {
    private ArrayList<Izbor> mIzbori;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.izbor_naslov);
        mIzbori = Izbornik.get(getActivity()).getIzbor();
    }
}
