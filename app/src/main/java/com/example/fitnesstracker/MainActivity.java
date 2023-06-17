package com.example.fitnesstracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    FirebaseAuth auth;
    Button logout_button;
    FirebaseUser user;
    TextView userEmail;
    boolean isPreviousUser = false;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auth = FirebaseAuth.getInstance();
        logout_button = findViewById(R.id.main_logout);
        user = auth.getCurrentUser();
        userEmail = findViewById(R.id.main_email);

        if(user == null)
        {
            Toast.makeText(MainActivity.this, "User Signed Out", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), Login.class);
            startActivity(intent);
            finish();
        }

        else
        {

            // TODO
            userEmail.setText(user.getEmail());
            Intent intent = new Intent(getApplicationContext(), GetUserFitness.class);
            startActivity(intent);
            finish();




        }

        logout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
                finish();

            }
        });

    }
}


