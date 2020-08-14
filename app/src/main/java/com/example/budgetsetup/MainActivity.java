package com.example.budgetsetup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name1 = findViewById(R.id.eating_out_text);
        name1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplication(), EditEnvelope.class);
                startActivity(a);
            }
        });

        Button name2 = findViewById(R.id.add_envelope_button);
        name2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplication(), AddEnvelope.class);
                startActivity(a);
            }
        });

    }
}