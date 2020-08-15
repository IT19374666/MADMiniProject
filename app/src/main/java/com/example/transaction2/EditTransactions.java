package com.example.transaction2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class EditTransactions extends AppCompatActivity {

    Button cbtn;
    Button ibtn;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_transactions);

        cbtn = findViewById(R.id.btn1);
        ibtn = findViewById(R.id.btn);
    }

    @Override
    protected void onResume() {
        super.onResume();
        cbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "Transaction Updated Successfully";
                int duration = Toast.LENGTH_SHORT;
                toast = Toast.makeText(context, text, duration);
                toast.setGravity(Gravity.BOTTOM, 0, 0);
                toast.show();
                Intent intent = new Intent(EditTransactions.this, My_Transaction.class);
                startActivity(intent);
            }
        });

        ibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text = "Transaction Updated Cancelled";
                int duration = Toast.LENGTH_SHORT;
                toast = Toast.makeText(context, text, duration);
                toast.setGravity(Gravity.BOTTOM, 0, 0);
                toast.show();

            }
        });
    }

}









