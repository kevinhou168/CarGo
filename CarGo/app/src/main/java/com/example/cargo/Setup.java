package com.example.cargo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Setup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);

        Button okbutton = findViewById(R.id.okbutton);                  //Button OK
        okbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNameSetup();
            }
        });

            //button to modify number +1
            //button to modify number -1

       Button back = findViewById(R.id.back);                          //change to back button
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBacktoMain();
            }
        });

    }

    private void goToNameSetup() {                                      //Button OK
        Intent intent = new Intent(this, namesetup.class);
        startActivity(intent);
    }

    private void goBacktoMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
