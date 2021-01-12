package com.example.forgot_password;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class searchable_spinner extends AppCompatActivity {

    Spinner spinner;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchable_spinner);

        spinner = findViewById(R.id.spinner);
        textView = findViewById(R.id.tvss);

        ArrayList<String> cities = new ArrayList<>();

        cities.add("select");
        cities.add("Adoni");
        cities.add("Agartala");
        cities.add("Ahmedabad");
        cities.add("Bangalore");
        cities.add("Bhopal");
        cities.add("Bhubaneswar");
        cities.add("Chandigarh");
        cities.add("Chandigarh");
        cities.add("Chennai");
        cities.add("Dehradun");
        cities.add("Delhi");
        cities.add("Gandhinagar");
        cities.add("Gangtok");
        cities.add("Vadodara");
        cities.add("Warangal");
        cities.add("Yamunanagar");

        spinner.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,cities));

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0){
                    Toast.makeText(searchable_spinner.this, "Please select something", Toast.LENGTH_SHORT).show();
                    textView.setText("");
                }else{
                    String scities = parent.getItemAtPosition(position).toString();
                    textView.setText(scities);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}