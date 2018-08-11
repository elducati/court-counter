package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int scoreForTeamA = 0;
    int scoreForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     *
     * Display for Team A
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *
     * Display for Team B
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void plusThreeForTeamA(View view) {
        displayForTeamA(scoreForTeamA = scoreForTeamA + 3);
    }

    public void plusTwoForTeamA(View view) {
        displayForTeamA(scoreForTeamA = scoreForTeamA + 2);
    }

    public void plusOneForTeamA(View view) {
        displayForTeamA(scoreForTeamA = scoreForTeamA + 1);
    }

    public void plusThreeForTeamB(View view) {
        displayForTeamB(scoreForTeamB = scoreForTeamB + 3);
    }

    public void plusTwoForTeamB(View view) {
        displayForTeamB(scoreForTeamB = scoreForTeamB + 2);
    }

    public void plusOneForTeamB(View view) {
        displayForTeamB(scoreForTeamB = scoreForTeamB + 1);
    }
    /**
     *
     * resets scores for both teams A and B to 0
     */
    public void reset(View view) {
        displayForTeamA(scoreForTeamA = 0);
        displayForTeamB(scoreForTeamB = 0);

    }
}
