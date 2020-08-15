package com.example.transaction2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class My_Transaction extends AppCompatActivity {


    ImageButton ib1;
    ImageButton ib2;
    ImageButton ib3;
    ImageButton ib4;
    ImageButton eb1;
    ImageButton eb2;
    ImageButton eb3;
    ImageButton eb4;
    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my__transaction);

        ib1 = findViewById(R.id.imageButton);
        ib2 = findViewById(R.id.imageButton2);
        ib3 = findViewById(R.id.imageButton3);
        ib4 = findViewById(R.id.imageButton4);
        eb1 = findViewById(R.id.imageButton5);
        eb2 = findViewById(R.id.imageButton6);
        eb3 = findViewById(R.id.imageButton7);
        eb4 = findViewById(R.id.imageButton8);
        txt1 = findViewById(R.id.tr1);
        txt2 = findViewById(R.id.tr2);
        txt3 = findViewById(R.id.tr3);
        txt4 = findViewById(R.id.tr4);
    }

    @Override
    protected void onResume() {
        super.onResume();
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt1.setText(" Deleted ");
            }
        });

        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt2.setText(" Deleted ");
            }
        });

        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt3.setText(" Deleted ");
            }
        });

        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt4.setText(" Deleted ");
            }
        });

        eb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(My_Transaction.this, EditTransactions.class);
                startActivity(intent);
            }


        });

        eb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(My_Transaction.this, EditTransactions.class);
                startActivity(intent);
            }
        });

        eb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(My_Transaction.this, EditTransactions.class);
                startActivity(intent);
            }


        });

        eb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(My_Transaction.this, EditTransactions.class);
                startActivity(intent);
            }


        });


    }


}