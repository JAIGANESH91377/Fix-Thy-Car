package com.example.userftc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class DashBoardActivity extends AppCompatActivity {
    TextView log_out;
    FirebaseAuth mAuth;
    private View towing,garage,services,fuel,aboutus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        mAuth = FirebaseAuth.getInstance();

        log_out = findViewById(R.id.logout);
        log_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoardActivity.this, LoginActivity.class));
                finish();
            }
        });

        towing = findViewById(R.id.towingActivity);
        towing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(DashBoardActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
        garage = findViewById(R.id.garageActivity);
        garage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(DashBoardActivity.this, GarageActivity.class);
                startActivity(intent);

            }
        });
        services = findViewById(R.id.servicesActivityCard);
        services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(DashBoardActivity.this, ServicesActivity.class);
                startActivity(intent);

            }
        });
        fuel = findViewById(R.id.fuelActivity);
        fuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(DashBoardActivity.this, FuelActivity.class);
                startActivity(intent);

            }
        });
        aboutus = findViewById(R.id.aboutus);
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardActivity.this, Aboutus.class);
                startActivity(intent);
            }
        });
    }
}