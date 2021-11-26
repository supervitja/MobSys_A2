package com.hsalbsig.mobsys_a2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signInButton = (Button) findViewById(R.id.button_signin);
        signInButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openGoogleSignInActivity();
            }
        });
    }
    public void openGoogleSignInActivity(){
        Intent intent = new Intent(this, GoogleSignActivity.class);
        startActivity(intent);
    }
}