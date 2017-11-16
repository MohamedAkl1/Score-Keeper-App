package com.example.akl.scorekeeperapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button team12plus,team12minus,team13plus,team13minus,team22plus,team22minus,team23plus,team23minus,resetButton;
    TextView team1score,team2score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //team 1
        team12plus = findViewById(R.id.team1_2plus);
        team12plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                twoplus(1);
            }
        });
        team12minus = findViewById(R.id.team1_2minus);
        team12minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                twominus(1);
            }
        });
        team13plus = findViewById(R.id.team1_3plus);
        team13plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                threeplus(1);
            }
        });
        team13minus = findViewById(R.id.team1_3minus);
        team13minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                threeminus(1);
            }
        });

        //team 2
        team22plus = findViewById(R.id.team2_2plus);
        team22plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                twoplus(2);
            }
        });
        team22minus = findViewById(R.id.team2_2minus);
        team22minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                twominus(2);
            }
        });
        team23plus = findViewById(R.id.team2_3plus);
        team23plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                threeplus(2);
            }
        });
        team23minus = findViewById(R.id.team2_3minus);
        team23minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                threeminus(2);
            }
        });

        team1score = findViewById(R.id.team1score);
        team2score = findViewById(R.id.team2score);

        resetButton = findViewById(R.id.reset_button);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                team1score.setText(Integer.toString(0));
                team2score.setText(Integer.toString(0));
            }
        });
    }


    @SuppressLint("SetTextI18n")
    void twoplus(int team){
        int temp;
        if(team == 1){
            temp = Integer.parseInt(team1score.getText().toString());
            team1score.setText(Integer.toString(temp+2));
        }else{
            temp = Integer.parseInt(team2score.getText().toString());
            team2score.setText(Integer.toString(temp+2));
        }
    }

    @SuppressLint("SetTextI18n")
    void threeplus(int team){
        int temp;
        if(team == 1){
            temp = Integer.parseInt(team1score.getText().toString());
            team1score.setText(Integer.toString(temp+3));
        }else{
            temp = Integer.parseInt(team2score.getText().toString());
            team2score.setText(Integer.toString(temp+3));
        }
    }

    @SuppressLint("SetTextI18n")
    void twominus(int team){
        int temp;
        if(team == 1){
            if(Integer.parseInt(team1score.getText().toString()) > 1){
                temp = Integer.parseInt(team1score.getText().toString());
                team1score.setText(Integer.toString(temp-2));
            }
        }else{
            if(Integer.parseInt(team2score.getText().toString()) > 1){
                temp = Integer.parseInt(team2score.getText().toString());
                team2score.setText(Integer.toString(temp-2));
            }
        }
    }

    @SuppressLint("SetTextI18n")
    void threeminus(int team){
        int temp;
        if(team == 1){
            if(Integer.parseInt(team1score.getText().toString()) > 2){
                temp = Integer.parseInt(team1score.getText().toString());
                team1score.setText(Integer.toString(temp-3));
            }
        }else{
            if(Integer.parseInt(team2score.getText().toString()) > 2){
                temp = Integer.parseInt(team2score.getText().toString());
                team2score.setText(Integer.toString(temp-3));
            }
        }
    }
}
