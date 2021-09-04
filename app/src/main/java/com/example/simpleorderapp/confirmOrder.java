package com.example.simpleorderapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class confirmOrder extends AppCompatActivity {

    private Button modifyButton;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_order);

        modifyButton = (Button) findViewById(R.id.modifyButton);
        submitButton = (Button) findViewById(R.id.subOrderButton);

        modifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                orderMenu();
            }
        });

       submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialoge();
            }
        });
    }

    public void orderMenu(){
        Intent intent1 = new Intent(this, OrderMenu.class);
        startActivity(intent1);
        finish();
    }

    public void completeOrder(){
        Intent intent2 = new Intent(this, completeOrder.class);
        startActivity(intent2);
        finish();
    }

    public void alertDialoge(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("確認送出訂單嗎？");
        builder.setPositiveButton("是", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                completeOrder();
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