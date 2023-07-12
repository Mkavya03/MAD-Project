package com.example.tictactoetutorial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener{
    Button play,exit,help;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        play=findViewById(R.id.button4);
        play.setOnClickListener(this);

        exit=findViewById(R.id.button7);
        exit.setOnClickListener(this);

        help=findViewById(R.id.button8);
        help.setOnClickListener(this);

    }

    public void onClick(View v) {
        if (v.equals(play)) {
            Intent it = new Intent(this, MainActivity.class);
            startActivity(it);
        } else if (v.equals(exit)) {
            finishAffinity(); // Close all activities of the app
            System.exit(0); // Terminate the app process
        }
        else if(v.equals(help)){
            Intent it = new Intent(this,helpactivity.class);
            startActivity(it);
        }
    }

}
