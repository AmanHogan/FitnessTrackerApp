package com.example.fitnesstracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class GetUserFitness extends AppCompatActivity implements AdapterView.OnItemSelectedListener {




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_user_fitness);

        // Create Spinner for activity Levels
        Spinner spinner_activity = findViewById(R.id.user_activity_level_id);
        ArrayAdapter<CharSequence> spinner_adapter = ArrayAdapter.createFromResource(this, R.array.activity_levels, android.R.layout.simple_spinner_item);
        spinner_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_activity.setAdapter(spinner_adapter);
        spinner_activity.setOnItemSelectedListener(this);

        // Create RadioGroup for Male and Female
        RadioGroup radioGroup;
        RadioButton radioButton;
        radioGroup = findViewById(R.id.user_gender_id);


    }

    // Listeners for Activity Spinner
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String selected_activity = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(), selected_activity, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }



}


/*
* int radioId = RadioGroup.getCheckedRadioButtonId();
* radioButton = findViewById(radioId);
*
*
* */