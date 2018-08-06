package com.example.user.roxio.activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.user.roxio.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    EditText inputUsername,inputPassword;
    Button login,signupacc;
    FirebaseAuth mAuth;
    FirebaSE

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       mAuth = FirebaseAuth.getInstance();
        inputUsername = findViewById(R.id.edtUsername);
        inputPassword = findViewById(R.id.edtPass);
        login = findViewById(R.id.btnLogin);


        signupacc = findViewById(R.id.btnSignUp);

        signupacc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //signup page

                Intent intent = new Intent(MainActivity.this, SignUp.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //login login goes here

                String username = inputUsername.getText().toString().trim();
                String password = inputPassword.getText().toString().trim();
                mAuth.signInWithEmailAndPassword(username, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //if task is successful

                    if (task.isSuccessful()) {

                        Toast.makeText(MainActivity.this, "Login success", Toast.LENGTH_SHORT).show();

                        //go to another page

                        Intent intent = new Intent(MainActivity.this, Dashboard.class);
                        startActivity(intent);

                    } else {


                        Toast.makeText(MainActivity.this, "Failed, Try Again", Toast.LENGTH_SHORT).show();

                    }

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                        //if task is not


                        Toast.makeText(MainActivity.this, "Failed to login, Try again", Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });

    }
}
