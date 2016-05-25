package com.example.ammar.dnevnik;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.MenuItem;

public class MainActivity extends FragmentActivity implements IzborListFragment.OnSadrzajSelectedListener {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        if (findViewById(R.id.fragment_container) != null) {


            if (savedInstanceState != null) {
                return;
            }


            IzborListFragment firstFragment = new IzborListFragment();


            firstFragment.setArguments(getIntent().getExtras());

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, firstFragment).commit();
        }
    }

    public void onIzborSelected (int position) {

        Izbornik izbornikFrag = (Izbornik)
                getSupportFragmentManager().findFragmentById(R.id.fragment_container);

        if (izbornikFrag != null) {

            izbornikFrag.updateIzborView(position);

        } else {

            Izbornik newFragment = new Izbornik();
            Bundle args = new Bundle();
            args.putInt(Izbornik.ARG_POSITION, position);
            newFragment.setArguments(args);
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();


            transaction.replace(R.id.fragmentContainer, newFragment);
            transaction.addToBackStack(null);


            transaction.commit();
        }
    }


}
