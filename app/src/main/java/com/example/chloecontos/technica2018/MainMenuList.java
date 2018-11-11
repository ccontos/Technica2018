package com.example.chloecontos.technica2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainMenuList extends AppCompatActivity {

    private static final boolean USE_FLAG = true;
    private static final int myFlag = Intent.FLAG_ACTIVITY_REORDER_TO_FRONT;

    private int[] BUTTONIMAGE = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background};

    private String[] BUTTONTITLE = {"Preparing a Spending Plan", "Saving for College", "Setting SMART Goals"};

    private ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_list);

        myListView = (ListView)findViewById(R.id.mainMenuListView);

        CustomeAdapter customeAdapter = new CustomeAdapter();
        myListView.setAdapter(customeAdapter);

        listViewClickListeners();
    }



    @Override
    protected  void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
    }




    class CustomeAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return BUTTONTITLE.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.custom_main_menu_list, null);

            ImageView buttonLogo = (ImageView)view.findViewById(R.id.mainMenuImage);
            TextView buttonName = (TextView)view.findViewById(R.id.mainMenuList);

            buttonLogo.setImageResource(BUTTONIMAGE[i]);
            buttonName.setText(BUTTONTITLE[i]);

            return view;
        }
    }



    /*
      Method: listViewClickListeners
      Input: void
      Output: void
      Purpose: Determines which item in the list was picked and then needs to send the user to the activity with the appropriate item click
  */
    private void listViewClickListeners(){
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                switch(i){
                    case 0:
                        Intent preppingspendingplan = new Intent(MainMenuList.this, PreparingSpendingPlan.class);
                        if(USE_FLAG)
                            preppingspendingplan.addFlags(myFlag);
                        startActivity(preppingspendingplan);
                        break;
                    case 1:
                        Intent savingforcollege = new Intent(MainMenuList.this , SavingForCollege.class);
                        if(USE_FLAG)
                            savingforcollege.addFlags(myFlag);
                        startActivity(savingforcollege);
                        break;
                    case 2:
                        Intent settingsmartgoals = new Intent(MainMenuList.this, SettingSMARTGoals.class);
                        if(USE_FLAG)
                            settingsmartgoals.addFlags(myFlag);
                        startActivity(settingsmartgoals);
                        break;
                }
            }
        });
    }

}

