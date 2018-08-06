package com.example.user.roxio.activities;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
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

public class SignUp extends AppCompatActivity {

    EditText name,mail,phone,pass;
    Button signUp;

    //initiating firebase instance

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        mAuth = FirebaseAuth.getInstance();
        name = findViewById(R.id.edtUsername);
        mail = findViewById(R.id.edtEmail);
        phone = findViewById(R.id.edtPhone);
        pass = findViewById(R.id.edtPassword);


        signUp = findViewById(R.id.btnSignUp);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //sign up logic goes here
                String email = mail.getText().toString().trim();
                String password = pass.getText().toString().trim();


                if (TextUtils.isEmpty(email)) {

                    Toast.makeText(SignUp.this, "Email field is empty, enter valid email address", Toast.LENGTH_SHORT).show();
                }

                if (TextUtils.isEmpty(password)) {

                    Toast.makeText(SignUp.this, "Password field is empty", Toast.LENGTH_SHORT).show();

                }


                if (password.length()<6) {

                    Toast.makeText(SignUp.this, "Password to short, Try with a minimum of six characters ", Toast.LENGTH_SHORT).show();
                }

                mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //if task is successful do this

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        //

                    }
                });




            }
        });








    }
}
