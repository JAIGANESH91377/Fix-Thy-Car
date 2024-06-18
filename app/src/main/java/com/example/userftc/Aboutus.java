package com.example.userftc;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Aboutus extends AppCompatActivity {

    private Button mFacebookButton;
    private Button mInstagramButton;
    private Button mTwitterButton;
    private Button mWhatsAppButton;
    private Button mFeedbackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        mFacebookButton = findViewById(R.id.facebook_button);
        mInstagramButton = findViewById(R.id.instagram_button);
        mTwitterButton = findViewById(R.id.twitter_button2);
        mWhatsAppButton = findViewById(R.id.whatsaap_button);
        mFeedbackButton = findViewById(R.id.whatsaap_button3);

        // Set up onClickListener for Facebook button
        mFacebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String facebookUrl = "https://www.facebook.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(facebookUrl));
                startActivity(intent);
            }
        });

        // Set up onClickListener for Instagram button
        mInstagramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String instagramUrl = "https://www.instagram.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(instagramUrl));
                startActivity(intent);
            }
        });

        // Set up onClickListener for Twitter button
        mTwitterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String twitterUrl = "https://twitter.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(twitterUrl));
                startActivity(intent);
            }
        });

        // Set up onClickListener for WhatsApp button
        mWhatsAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String whatsappNumber = "9324261334";
                // Replace with your own WhatsApp number
                String whatsappUrl = "https://api.whatsapp.com/send?phone=" + whatsappNumber;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(whatsappUrl));
                startActivity(intent);
            }
        });

        // Set up onClickListener for Feedback button
        mFeedbackButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Aboutus.this, FeedbackActivity.class);
                    startActivity(intent);
                    Toast.makeText(Aboutus.this, "Feedback Page Opened!", Toast.LENGTH_SHORT).show();
                }
            });

        }
}

