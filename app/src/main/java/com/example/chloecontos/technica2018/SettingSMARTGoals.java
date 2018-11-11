package com.example.chloecontos.technica2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingSMARTGoals extends AppCompatActivity {
    private static final boolean USE_FLAG = true;
    private static final int myFlag = Intent.FLAG_ACTIVITY_REORDER_TO_FRONT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_smartgoals);

        final Button button = findViewById(R.id.tipButton);
    }
    public void tipOnClick(View view){
        Intent settingsmartgoalstips = new Intent(SettingSMARTGoals.this, SettingSMARTGoalsTips.class);
        if(USE_FLAG)
            settingsmartgoalstips.addFlags(myFlag);
        startActivity(settingsmartgoalstips);
    }
//
//    public void resourcesOnClick(View view){
//        Intent savingforcollegeresources = new Intent(SettingSMARTGoals.this, SettingSMARTGoalsResources.class);
//        if(USE_FLAG)
//            settingsmartgoalsresources.addFlags(myFlag);
//        startActivity(settingsmartgoalsresources);
//    }
}
