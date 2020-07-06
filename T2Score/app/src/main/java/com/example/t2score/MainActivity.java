package com.example.t2score;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int Ascore = 0;
    int Bscore = 0;
    TextView scoreView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void teamAScoreOne(View view) {

        Ascore = Ascore + 1;
        displayForTeamA(Ascore);
    }

    public void teamAScoreTwo(View view) {
        Ascore = Ascore + 2;
        displayForTeamA(Ascore);
    }

    public void teamAScoreThree(View view) {
        Ascore = Ascore + 3;
        displayForTeamA(Ascore);
    }

    private void displayForTeamA(int score) {
        scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText("" + score);
    }

    public void teamBScoreOne(View view) {
        Bscore = Bscore+ 1;
        displayForTeamB(Bscore);
    }

    public void teamBScoreTwo(View view) {
        Bscore = Bscore + 2;
        displayForTeamB(Bscore);
    }

    public void teamBScoreThree(View view) {
        Bscore= Bscore + 3;
        displayForTeamB(Bscore);
    }

    private void displayForTeamB(int score) {
        scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetButton(View view) {
        Ascore=0;
        Bscore=0;
        displayForTeamA(0);
        displayForTeamB(0);

    }



}
