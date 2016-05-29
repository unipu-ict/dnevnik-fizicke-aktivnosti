package com.example.ammar.dnevnik;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class GoActivity extends AppCompatActivity {
    private static Button mGo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);

        mGo = (Button) findViewById(R.id.go);
        mGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GoActivity.this, MainActivity.class);
                startActivity(i);
            }
        });



    }

}


