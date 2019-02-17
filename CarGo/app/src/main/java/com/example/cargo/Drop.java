package com.example.cargo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Drop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop);

        Button confirmdrop = findViewById(R.id.confirmdrop);
        confirmdrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDriving();
            }
        });

        Button back3 = findViewById(R.id.back3);
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDriving3();
            }
        });
    }

    private void goToDriving() {
        Intent intent = new Intent(this, Driving.class);
        startActivity(intent);
    }

    private void goToDriving3() {
        Intent intent = new Intent(this, Driving3.class);
        startActivity(intent);
    }
}
