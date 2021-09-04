package com.example.simpleorderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OrderMenu extends AppCompatActivity {

    private Button cancelButton;
    private Button confirmButton;
    private TextView display;

    private TextView rice;
    private TextView desert;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_menu);

        rice = (TextView) findViewById(R.id.cataRice);
        rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toCataRice();
            }
        });

        desert = (TextView) findViewById(R.id.cataDesert);
        desert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toCataDesert();
            }
        });


        // buttons
        cancelButton = (Button) findViewById(R.id.cancel_button);
        confirmButton = (Button) findViewById(R.id.confirm_button);

        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToMainPage();
            }
        });
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirmOrder();
            }
        });

    }

    public void toCataRice(){
        Intent cataRice = new Intent(this, cataRice.class);
        startActivity(cataRice);
    }

    public void toCataDesert(){
        Intent cataDesert = new Intent(this, cataDesert.class);
        startActivity(cataDesert);
    }

    public void backToMainPage(){
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
        finish();
    }

    private void confirmOrder(){
        Intent intent2 = new Intent(this, confirmOrder.class);
        startActivity(intent2);
        finish();
    }

}