package com.example.chloecontos.technica2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class PreparingSpendingPlanResources extends AppCompatActivity {

    private static final boolean USE_FLAG = true;
    private static final int myFlag = Intent.FLAG_ACTIVITY_REORDER_TO_FRONT;

    private String[] TITLE = {"Spending Plan Worksheet", "A free course about spending and saving", "Information on how manage your money", "Simple budgeting video"};

    private String[] INFO = {"https://www.saveandinvest.org/file/document/spending-plan-worksheet", "https://www.smartaboutmoney.org/Courses/Money-Basics/Spending-And-Saving", "https://www.consumer.gov/section/managing-your-money", "https://www.youtube.com/watch?v=6Ib-bdko5cE"};

    private ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preparing_spending_plan_resources);

        myListView = (ListView)findViewById(R.id.preparingresourcesListView);

        CustomeAdapter customeAdapter = new CustomeAdapter();
        myListView.setAdapter(customeAdapter);
    }


    class CustomeAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return TITLE.length;
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
            view = getLayoutInflater().inflate(R.layout.custom_resources, null);

            TextView texttTitle = (TextView)view.findViewById(R.id.resourceTitle);
            TextView titleInfo = (TextView)view.findViewById(R.id.resourceLink);

            texttTitle.setText(TITLE[i]);
            titleInfo.setText(INFO[i]);

            return view;
        }
    }
}
