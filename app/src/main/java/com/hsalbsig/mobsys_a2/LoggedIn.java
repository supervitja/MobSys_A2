package com.hsalbsig.mobsys_a2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;

public class LoggedIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);

        TextView name = findViewById(R.id.name);
        TextView mail = findViewById(R.id.mail);

        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);

        if(account != null){
            name.setText(account.getDisplayName());
            mail.setText(account.getEmail());
        }


        Button logout = findViewById(R.id.sign_out_button);
        logout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                FirebaseAuth.getInstance().signOut();
                Intent goBack = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(goBack);
            }
        });

    }
}