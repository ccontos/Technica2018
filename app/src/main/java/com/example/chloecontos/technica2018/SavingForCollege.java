package com.example.chloecontos.technica2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SavingForCollege extends AppCompatActivity {

    private static final boolean USE_FLAG = true;
    private static final int myFlag = Intent.FLAG_ACTIVITY_REORDER_TO_FRONT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saving_for_college);

        final Button button = findViewById(R.id.tipButton);
    }

    public void tipOnClick(View view){
        Intent savingforcollegetips = new Intent(SavingForCollege.this, SavingForCollegeTips.class);
        if(USE_FLAG)
            savingforcollegetips.addFlags(myFlag);
        startActivity(savingforcollegetips);
    }

    public void resourcesOnClick(View view){
        Intent savingforcollegeresources = new Intent(SavingForCollege.this, SavingForCollegeResources.class);
        if(USE_FLAG)
           savingforcollegeresources.addFlags(myFlag);
        startActivity(savingforcollegeresources);
    }
}
