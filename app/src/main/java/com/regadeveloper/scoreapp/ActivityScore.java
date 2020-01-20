package com.regadeveloper.scoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityScore extends AppCompatActivity {
    int scoreTeamA, scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void satuPointA(View view) {
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);

    }

    public void duaPointA(View view) {
        scoreTeamA = scoreTeamA +2;
        displayForTeamA(scoreTeamA);

    }

    public void tigaPointA(View view) {
        scoreTeamA = scoreTeamA +3;
        displayForTeamA(scoreTeamA);

    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void satuPointB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);

    }

    public void duaPointB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);

    }
    public void tigaPointB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);

    }

    public void resetPoint(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void minusSatuA(View view) {
        scoreTeamA = scoreTeamA -1;
        displayForTeamA(scoreTeamA);
    }

    public void minusSatuB(View view) {
        scoreTeamB = scoreTeamB -1;
        displayForTeamB(scoreTeamB);
    }
}
