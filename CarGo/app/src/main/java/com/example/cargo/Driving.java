package com.example.cargo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Driving extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driving);

        Button drop1 = findViewById(R.id.drop1);
        drop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDrop();
            }
        });

        Button add = findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAdd();
            }
        });

        Button finish = findViewById(R.id.finish);
        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTosummary();
            }
        });
    }

    private void goToDrop() {
        Intent intent = new Intent(this, Drop.class);
        startActivity(intent);
    }

    private void goToAdd() {
        Intent intent = new Intent(this, Add.class);
        startActivity(intent);
    }

    private void goTosummary() {
        Intent intent = new Intent(this, summary.class);
        startActivity(intent);
    }


}
