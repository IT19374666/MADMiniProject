package com.example.bill_tracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button newbill= findViewById(R.id.new_bill);
        newbill.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent e =new Intent(getApplication(), MainActivity2.class);

                startActivity(e);
            }
        });
        Button update1 = findViewById(R.id.update1);
        update1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent e =new Intent(getApplication(), MainActivity3.class);

                startActivity(e);
            }
        });

        Button update2 = findViewById(R.id.update2);
        update2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent e =new Intent(getApplication(), MainActivity3.class);

                startActivity(e);
            }
        });

        Button update3 = findViewById(R.id.update3);
        update3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent e =new Intent(getApplication(), MainActivity3.class);

                startActivity(e);
            }
        });

        Button update4 = findViewById(R.id.update4);
        update4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent e =new Intent(getApplication(), MainActivity3.class);

                startActivity(e);
            }
        });

        Button delete1 = findViewById(R.id.delete1);
        delete1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent e =new Intent(getApplication(), MainActivity4.class);

                startActivity(e);
            }
        });

        Button delete2 = findViewById(R.id.delete2);
        delete2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent e =new Intent(getApplication(), MainActivity4.class);

                startActivity(e);
            }
        });

        Button delete3 = findViewById(R.id.delete3);
        delete3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent e =new Intent(getApplication(), MainActivity4.class);

                startActivity(e);
            }
        });

        Button delete4 = findViewById(R.id.delete4);
        delete4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent e =new Intent(getApplication(), MainActivity4.class);

                startActivity(e);
            }
        });
    }
}