package com.example.userftc;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class FuelActivity extends AppCompatActivity {

    private static final String[] VIDEO_ID = {"nCwWPlaghfs", "0XpWvqWG4WA", "XN4GSRObmBA", "4mOm2u9YqwA"};
    private YouTubePlayerView youTubePlayerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuel);

        youTubePlayerView = findViewById(R.id.youtube_player_view1);
        youTubePlayerView = findViewById(R.id.youtube_player_view2);
        youTubePlayerView = findViewById(R.id.youtube_player_view3);
        youTubePlayerView = findViewById(R.id.youtube_player_view4);

        getLifecycle().addObserver(youTubePlayerView);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(YouTubePlayer youTubePlayer) {
                youTubePlayer.loadVideo(String.valueOf(VIDEO_ID), 0f);
            }
        });
    }
}
