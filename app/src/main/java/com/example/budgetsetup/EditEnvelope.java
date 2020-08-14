package com.example.budgetsetup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditEnvelope extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_envelope);

        Button name3 = findViewById(R.id.delete_envelope_btn);
        name3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplication(), DeleteEnvelope.class);
                startActivity(a);
            }
        });

        Button name4 = findViewById(R.id.save_envelope_btn);
        name4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplication(), MainActivity.class);
                startActivity(a);
            }
        });


    }
}