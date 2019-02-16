package com.example.cargo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class SetupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setup);

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
        Intent intent = new Intent(this, NameSetupActivity.class);
        startActivity(intent);
    }

    private void goBacktoMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    }
}
