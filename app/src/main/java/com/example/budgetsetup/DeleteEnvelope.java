package com.example.budgetsetup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeleteEnvelope extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_envelope);

        Button name5 = findViewById(R.id.delete_no_btn);
        name5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(getApplication(), EditEnvelope.class);
                startActivity(e);
            }
        });

        Button name6 = findViewById(R.id.delete_yes_btn);
        name6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(getApplication(), MainActivity.class);
                startActivity(e);
            }
        });

    }
}