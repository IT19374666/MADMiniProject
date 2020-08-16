package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MyAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);

        FloatingActionButton floatingActionButtonbutton = findViewById(R.id.addAccBtn);
        floatingActionButtonbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openAddAcount();
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.Account);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.Account:
                        startActivity(new Intent(getApplicationContext(), MyAccount.class));
                        return true;
                    case R.id.Envelope:
                        startActivity(new Intent(getApplicationContext(), AddAccount.class));
                        return true;
                    case R.id.BillTracker:
                        startActivity(new Intent(getApplicationContext(), AddAccount.class));
                        return true;
                    case R.id.Transaction:
                        startActivity(new Intent(getApplicationContext(), AddAccount.class));
                        return true;
                }


                return false;

            }
        });


    }

    public void openAddAcount() {
        Intent intent = new Intent(this, AddAccount.class);
        startActivity(intent);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.account_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.editAcc:
                startActivity(new Intent(this, UpdateAccount.class));
                return true;
            case R.id.deleteAcc:
                startActivity(new Intent(this, UpdateAccount.class));
                return true;
            case R.id.transferMoney:
                startActivity(new Intent(this, TransferMoneyFromAccount.class));
                return true;
            case R.id.addAcc:
                startActivity(new Intent(this, AddAccount.class));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}