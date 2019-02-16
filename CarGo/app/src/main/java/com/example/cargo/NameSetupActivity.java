package com.example.cargo;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class NameSetupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nameSetup);

        Button okbutton = findViewById(R.id.okbutton);                  //Button OK
        okbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNameSetup();
            }
        });

        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBacktoSetup();
            }
        });
    }



    private void goBacktoSetup() {
        Intent intent = new Intent(this, SetupActivity.class);
        startActivity(intent);
}
