package com.example.userftc;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class Feedback {
    private String name1;
    private String email1;
    private float rating;
    private String message1;

    public Feedback(String name1, String email1, float rating, String message1) {
        this.name1 = name1;
        this.email1 = email1;
        this.rating = rating;
        this.message1 = message1;
    }

    public void saveFeedback() {
        DatabaseReference database = FirebaseDatabase.getInstance().getReference();
        DatabaseReference feedbackRef = database.child("Feedback List").push();
        String feedbackId = feedbackRef.getKey();

        Map<String, Object> feedbackData = new HashMap<>();
        feedbackData.put("name", name1);
        feedbackData.put("email", email1);
        feedbackData.put("rating", rating);
        feedbackData.put("message", message1);

        feedbackRef.setValue(feedbackData).addOnCompleteListener(new OnCompleteListener<Void>() {

            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if (task.isSuccessful()) {
                    Log.d("Feedback", "Feedback saved successfully!");
                } else {
                    Log.e("Feedback", "Error saving feedback: " + task.getException().getMessage());
                }
            }

        });
//        String name1 = feedbackRef.push().getKey();
//        feedbackRef.child(name1).setValue("Feedback List",name1);
    }

}

