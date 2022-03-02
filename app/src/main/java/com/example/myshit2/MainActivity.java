package com.example.myshit2;

import static android.widget.Toast.*;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    /**
     * This is a button function that takes a pressed input on the button
     */

    //public void clickFunction(View view)
    public void login(View view) {

        EditText labelFullName = (EditText) findViewById(R.id.labelFullName); // it enters a User Full Name

        EditText labelUsername = (EditText) findViewById(R.id.labelUsername); // it enters User Name

        EditText passwordText = (EditText) findViewById(R.id.passwordText); // it enters User Password

        Log.i("Info:", "Porra Merda Ya!");

        Log.i("labelUsername", labelFullName.getText().toString());

        Log.i("passwordText", labelUsername.getText().toString());

        makeText(this, "Ola " + labelFullName.getText().toString(), LENGTH_LONG).show();// this code says Hi, Ola or Hello to a user

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        button.setOnClickListener( view -> {

            Intent intent = new Intent(this, ScreenActivity2.class);
            EditText labelFullName = (EditText) findViewById(R.id.labelFullName); // it enters a User Full Name
            Toast.makeText(this, "Seja Bem-Vindo e tenha um bom trabalho " + labelFullName.getText().toString(), LENGTH_LONG).show();// this code says Hi, Ola or Hello to a user
            startActivity(intent);

            });


    }

}

