package com.example.simpleorderapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class completeOrder extends AppCompatActivity {

    private Button nextButton;
    private Button finishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_order);

        nextButton = (Button) findViewById(R.id.nextOrderButton);
        finishButton = (Button) findViewById(R.id.finishOrderButton);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orderMenu();
            }
        });

        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialoge();
            }
        });
    }

    public void orderMenu(){
        Intent intent1 = new Intent(this, OrderMenu.class);
        startActivity(intent1);
    }

    public void exitApp(){
        finish();
        System.exit(0);
    }

    public void alertDialoge(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("確認離開簡易點餐系統嗎？");
        builder.setPositiveButton("是", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                exitApp();
            }
        });

        builder.setNegativeButton("否", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.create();
        builder.show();
    }


}