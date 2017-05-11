package com.example.android.usernameloginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by CHANDAN on 5/11/2017.
 */

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.output);
        TextView output = (TextView)findViewById(R.id.username_output);

        Intent intent = getIntent();
        String str = "Welcome "+ intent.getStringExtra("username");
        output.setText(str);
            output.setText(str);

        }

}
