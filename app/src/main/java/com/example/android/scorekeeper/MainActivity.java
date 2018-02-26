package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * Global variables for Liverpool FC and Manchester City.
     */
    int GoalLiverpool;
    int YellowLiverpool;
    int RedLiverpool;

    int GoalManchester;
    int YellowManchester;
    int RedManchester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayGoalForLiverpool(0);
        displayYellowForLiverpool(0);
        displayRedForLiverpool(0);

        displayGoalForManchester(0);
        displayYellowForManchester(0);
        displayRedForManchester(0);
    }

    /**
     * Adds stats for both teams.
     */
    public void addGoalLiverpool(View view){ displayGoalForLiverpool(GoalLiverpool+=1); }
    public void addYellowLiverpool(View view){ displayYellowForLiverpool(YellowLiverpool+=1); }
    public void addRedLiverpool (View view) { displayRedForLiverpool(RedLiverpool+=1); }

    public void addGoalManchester(View view){ displayGoalForManchester(GoalManchester+=1); }
    public void addYellowManchester(View view){ displayYellowForManchester(YellowManchester+=1); }
    public void addRedManchester (View view) { displayRedForManchester(RedManchester+=1); }

    /**
     * Methods which display details in TextViews.
     */
    public void displayGoalForLiverpool(int score) {
        TextView scoreView = findViewById(R.id.show_score_liverpool);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowForLiverpool(int score){
        TextView scoreView = findViewById(R.id.show_yellow_liverpool);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedForLiverpool(int score){
        TextView scoreView = findViewById(R.id.show_red_liverpool);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGoalForManchester(int score) {
        TextView scoreView = findViewById(R.id.show_score_manchester);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowForManchester(int score){
        TextView scoreView = findViewById(R.id.show_yellow_manchester);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedForManchester(int score){
        TextView scoreView = findViewById(R.id.show_red_manchester);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View view){
        GoalLiverpool = YellowLiverpool = RedLiverpool = GoalManchester = YellowManchester = RedManchester = 0;

        displayGoalForLiverpool(GoalLiverpool);
        displayYellowForLiverpool(YellowLiverpool);
        displayRedForLiverpool(RedLiverpool);

        displayGoalForManchester(GoalManchester);
        displayYellowForManchester(YellowManchester);
        displayRedForManchester(RedManchester);
    }
}
