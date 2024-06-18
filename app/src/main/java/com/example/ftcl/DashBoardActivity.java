package com.example.ftcl;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

public class DashBoardActivity extends AppCompatActivity {
    TextView log_out;
    FirebaseAuth auth;
    private View towing,garage,services,fuel,about;


    private ImageView recLoc;

//    DrawerLayout drawerLayout;
//
//    NavigationView navigationView;
//
//    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        auth = FirebaseAuth.getInstance();


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
                Intent intent = new Intent(DashBoardActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
        garage = findViewById(R.id.garageActivity);
        garage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardActivity.this, GarageActivity.class);
                startActivity(intent);

            }
        });
        services = findViewById(R.id.servicesActivityCard);
        services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardActivity.this, ServicesActivity.class);
                startActivity(intent);

            }
        });
        fuel = findViewById(R.id.fuelActivity);
        fuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashBoardActivity.this, FuelActivity.class);
                startActivity(intent);

            }
        });
//        drawerLayout =findViewById(R.id.drawerLayout);
//        navigationView = findViewById(R.id.navigationView);
//        toolbar = findViewById(R.id.toolbar);
//
//        //Now Firstly Setting Up the Toolbar
//        setSupportActionBar(toolbar);
////        getSupportActionBar(toolbar);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this,drawerLayout,toolbar,R.string.OpenDrawer,R.string.CloseDrawer);
//
//        drawerLayout.addDrawerListener(toggle);
//
//        toggle.syncState();
//
////        loadFragment(new AFragment());
//
//        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                int id = item.getItemId();
//
//                if(id==R.id.optHome) {
////                    loadFragment(new AFragment());
//                    Toast.makeText(DashBoardActivity.this, "Opening dashboard", Toast.LENGTH_SHORT).show();
//
//                } else if (id==R.id.optAboutUs) {
//                    Intent intent = new Intent(DashBoardActivity.this,AboutusActivity.class);
//                    startActivity(intent);
//                    Toast.makeText(DashBoardActivity.this, "Opening about us", Toast.LENGTH_SHORT).show();
//
//                }else if (id==R.id.optSettings){
//                    Intent intent = new Intent(DashBoardActivity.this,SettingsActivity.class);
//                    startActivity(intent);
//                    Toast.makeText(DashBoardActivity.this, "Opening settings", Toast.LENGTH_SHORT).show();
//                }
//
//                return true;
//
//            }
//        });
//        }

//    private void loadFragment(Fragment fragment) {
//        FragmentManager fn = getSupportFragmentManager();
//        FragmentTransaction ft = fn.beginTransaction();
//
//        ft.add(R.id.container,fragment);
//        ft.commit();
//
//        Intent intent = new Intent(DashBoardActivity.this,DashBoardActivity.class);
//        startActivity(intent);
    }
}