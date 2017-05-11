package com.example.android.usernameloginapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}

    public void click(View view)
    {
        EditText myEdit = (EditText) findViewById(R.id.input);
        String myEditValue = myEdit.getText().toString().trim();
//bundle object creation
        Intent i = new Intent(this, LoginActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("username",myEditValue);
        i.putExtras(bundle);

        startActivity(i);
    }




}



