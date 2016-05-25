package com.example.ammar.dnevnik;

import android.app.Activity;
import android.app.ListFragment;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by acer on 23.5.2016..
 */
public class IzborListFragment extends ListFragment {
    OnSadrzajSelectedListener mCallback;


    public interface OnSadrzajSelectedListener {

        public void onIzborSelected(int position);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        int layout = Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB ?
                android.R.layout.simple_list_item_activated_1 : android.R.layout.simple_list_item_1;


        setListAdapter(new ArrayAdapter<String>(getActivity(), layout, Izbor.Sadrzaj));
    }

    @Override
    public void onStart() {
        super.onStart();


        if (getFragmentManager().findFragmentById(R.id.izbor) != null) {
            getListView().setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);


        try {
            mCallback = (OnSadrzajSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + "Mora se implementirati sadrzaj");
        }
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {

        mCallback.onIzborSelected(position);


        getListView().setItemChecked(position, true);
    }
}
