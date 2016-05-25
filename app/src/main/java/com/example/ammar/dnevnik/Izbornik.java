package com.example.ammar.dnevnik;

import android.app.Fragment;
import android.app.ListFragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by acer on 22.5.2016..
 */
public class Izbornik extends Fragment {
    final static String ARG_POSITION = "position";
    int mCurrentPosition = -1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        if (savedInstanceState != null) {
            mCurrentPosition = savedInstanceState.getInt(ARG_POSITION);
        }


        return inflater.inflate(R.layout.content_main, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        Bundle args = getArguments();
        if (args != null) {

            updateIzborView(args.getInt(ARG_POSITION));
        } else if (mCurrentPosition != -1) {

            updateIzborView(mCurrentPosition);
        }
    }

    public void updateIzborView(int position) {
        TextView article = (TextView) getActivity().findViewById(R.id.izbor);
        article.setText(Izbor.Izbor[position]);
        mCurrentPosition = position;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);


        outState.putInt(ARG_POSITION, mCurrentPosition);
    }
}