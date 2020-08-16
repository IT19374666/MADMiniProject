package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class TransferMoneyFromAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_money_from_account);

        //Impement spinners

        String[] arraySpinner1= new String[]{
                "Choose the account from....", "Savings1", "Savings2","My creadit","My wallet"
        };
        String[] arraySpinner2= new String[]{
                "Choose the account to...", "Savings1", "Savings2","My creadit","My wallet"
        };

        Spinner s1 = (Spinner) findViewById(R.id.fromAccNameSpinner);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arraySpinner1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter1);


        Spinner s2 = (Spinner) findViewById(R.id.toAccNameSpinner);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arraySpinner2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(adapter2);

        //Implemet the onclick event for back button

        Button button = findViewById(R.id.account_back_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(TransferMoneyFromAccount.this, MyAccount.class);
                startActivity(intent);

            }
        });




    }
}