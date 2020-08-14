package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class UpdateAccount extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_account);

        String[] arraySpinner1 = new String[]{
                "Choose Account Type....", "Savings", "Credit card","Cash"
        };

        Spinner s1 = (Spinner) findViewById(R.id.accTypeSpinner);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arraySpinner1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter1);
        s1.setOnItemSelectedListener(this);

        ArrayList<String> accName = new ArrayList<String>();
        accName.add("Savings");
        accName.add("Savings");
        accName.add("Savings");
        accName.add("Savings");
        accName.add("Savings");

        String[] arraySpinner2 = new String[]{
                "Choose the account name", "Savings1", "Savings2","My creadit","My wallet"
        };

        Spinner s2 = (Spinner) findViewById(R.id.AccNameSpinner);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arraySpinner2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(adapter2);
        s2.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        String text = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(),text + " selected",1).show();


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}