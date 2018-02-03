package com.example.android.rugbyscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    int scoreTeamB = 0;

    private String SCORE_TEAM_A = "SCORETEAM_A";
    private String SCORE_TEAM_B = "SCORETEAM_B";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Use onSaveInstanceState(Bundle) and onRestoreInstanceState

    @Override
    public void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);
        outState.putInt(SCORE_TEAM_A, scoreTeamA);
        outState.putInt(SCORE_TEAM_B, scoreTeamB);
    }

//onRestoreInstanceState

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {

        super.onRestoreInstanceState(savedInstanceState);

        // Restore UI state from the savedInstanceState.
        // This bundle has also been passed to onCreate.


        scoreTeamA = savedInstanceState.getInt(SCORE_TEAM_A);
        scoreTeamB = savedInstanceState.getInt (SCORE_TEAM_B);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Adds seven points for a penalty try for Team A.
     */
    public void penaltyTryTeamA(View view){
        scoreTeamA = scoreTeamA + 7;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds five points for a try for Team A.
     */

    public void tryTeamA(View view){
        scoreTeamA = scoreTeamA + 5;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds three points for a Drop kick for Team A.
     */

    public void dropKickTeamA(View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds three points for a penalty kick for Team A.
     */

    public void penaltyTeamA(View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds two points for a conversion for Team A.
     */

    public void conversionTeamA(View view){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds seven points for a penalty try for Team B.
     */
    public void penaltyTryTeamB(View view){
        scoreTeamB = scoreTeamB + 7;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds Five points for a Try for Team B.
     */

    public void tryTeamB(View view){
        scoreTeamB = scoreTeamB + 5;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds three points for a drop kick for Team B.
     */

    public void dropKickTeamB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds three points for a penalty goal for Team B.
     */

    public void penaltyTeamB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds two point to team B.
     */

    public void conversionTeamB(View view){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays zero score for Team A and Team B.
     */
    public void resetButton(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}

