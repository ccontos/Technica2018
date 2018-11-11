package com.example.chloecontos.technica2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final boolean USE_FLAG = true;
    private static final int myFlag = Intent.FLAG_ACTIVITY_REORDER_TO_FRONT;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.letsGetStartedButton);
    }


    public void letsGetStartedOnClick(View view){
        Intent mainmenulist = new Intent(MainActivity.this, MainMenuList.class);
        if(USE_FLAG)
            mainmenulist.addFlags(myFlag);
        startActivity(mainmenulist);
    }


}
