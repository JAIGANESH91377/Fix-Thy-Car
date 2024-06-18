package com.example.userftc;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class FeedbackActivity extends AppCompatActivity {
    Button submitbutton;
    EditText email,pass,name,message;
    RatingBar ratingBar;

    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);



        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference feedbackRef = database.getReference("Feedback Details");

        mAuth = FirebaseAuth.getInstance();
        email= findViewById(R.id.emailEditText);
        pass = findViewById(R.id.passEditText);
        name = findViewById(R.id.nameEditText);
        submitbutton=findViewById(R.id.submitBtn);

        mAuth = FirebaseAuth.getInstance();
        submitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email1 = email.getText().toString();
                String pass1 = pass.getText().toString();
                if (!email1.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email1).matches()) {
                    if (!pass1.isEmpty()) {
                        mAuth.signInWithEmailAndPassword(email1, pass1)
                                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                                    @Override
                                    public void onSuccess(AuthResult authResult) {
                                        Toast.makeText(FeedbackActivity.this, "FeedBack Submitted", Toast.LENGTH_SHORT).show();
//                                        Feedback feedbackInstance = new Feedback();
//                                        feedbackInstance.saveFeedback();
                                        String name1 = name.getText().toString();
                                        String email1 = email.getText().toString();
                                        float rating = ratingBar.getRating();
                                        String message1 = message.getText().toString();

                                        Feedback feedback = new Feedback(name1, email1, (int) rating, message1);
                                        feedback.saveFeedback();
                                        name.setText("");
                                        email.setText("");
                                        ratingBar.setRating(0.0f);
                                        message.setText("");
                                        pass.setText("");

                                    }
                                }).addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                        Toast.makeText(FeedbackActivity.this, "Feedback Submission Failed", Toast.LENGTH_SHORT).show();
                                    }
                                });
                    } else if (email1.isEmpty() && pass1.isEmpty()) {
                        Toast.makeText(FeedbackActivity.this, "Please Enter Email And Password", Toast.LENGTH_SHORT).show();
                    } else if (email1.isEmpty()) {
                        email.setError("Please Enter Email");
                    } else if (pass1.isEmpty()) {
                        pass.setError("Please Enter Password");
                    }else {
                        pass.setError("Empty Field are Not allowed");
                    }
                }
                }
        });
        ratingBar = findViewById(R.id.ratingBar);
        float rating = ratingBar.getRating();
        message=findViewById(R.id.feedbackEditText);
//        name = Feedback.name1;
//        email = Feedback.email1;
//        rating = Feedback.rating1;
//        message = Feedback.message1;

    }
}