package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton floatingActionButtonbutton =  findViewById(R.id.addAccBtn);
        floatingActionButtonbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                openAddAcount();
            }
        });

        BottomNavigationItemView bottomNavigationItemView = findViewById(R.id.bottomNavigationView);
        bottomNavigationItemView.setO
                (this);
    }

    public void openAddAcount(){
        Intent intent = new Intent(this,AddAccount.class);
        startActivity(intent);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.account_menu,menu);
        return true;
    }
    public
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.editAcc:
                startActivity(new Intent(this, UpdateAccount.class));
                return true;
            case R.id.deleteAcc:
                startActivity(new Intent(this, AddAccount.class));
                return true;
            case R.id.transferMoney:
                startActivity(new Intent(this, AddAccount.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}