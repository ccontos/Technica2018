package com.example.chloecontos.technica2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreparingSpendingPlan extends AppCompatActivity {

    private static final boolean USE_FLAG = true;
    private static final int myFlag = Intent.FLAG_ACTIVITY_REORDER_TO_FRONT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preparing_spending_plan);

        final Button button = findViewById(R.id.tipButton);
    }

    public void tipOnClick(View view){
        Intent preparingspendingplantips = new Intent(PreparingSpendingPlan.this, PreppingSpendingPlanTips.class);
        if(USE_FLAG)
            preparingspendingplantips.addFlags(myFlag);
        startActivity(preparingspendingplantips);
    }

    public void resourcesOnClick(View view){
        Intent preparingspendingplanresources = new Intent(PreparingSpendingPlan.this, PreparingSpendingPlanResources.class);
        if(USE_FLAG)
            preparingspendingplanresources.addFlags(myFlag);
        startActivity(preparingspendingplanresources);
    }

    public void quizOnClick(View view){
        Intent preparingspendingplanquiz = new Intent(PreparingSpendingPlan.this, PreparingSpendingPlanQuiz.class);
        if(USE_FLAG)
            preparingspendingplanquiz.addFlags(myFlag);
        startActivity(preparingspendingplanquiz);
    }
}
