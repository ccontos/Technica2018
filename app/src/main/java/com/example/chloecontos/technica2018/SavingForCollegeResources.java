package com.example.chloecontos.technica2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SavingForCollegeResources extends AppCompatActivity {

    private static final boolean USE_FLAG = true;
    private static final int myFlag = Intent.FLAG_ACTIVITY_REORDER_TO_FRONT;

    private String[] TITLE = {"How much money to save at different stages in your life:", "A resource for finding scholarships:", "Federal government grant: ", "List of grants and scholarship for students to be eligible for 4 year institution: "};

    private String[] INFO = {"https://www.capitalone.com/bank/money-management/savings-account/save-in-20s-30s-40s/", "https://www.scholarshipsharing.org/", "https://studentaid.ed.gov/sa/types/grants-scholarships", "https://www.sapling.com/8477087/list-federal-grants"};

    private ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saving_for_college_resources);

        myListView = (ListView)findViewById(R.id.savingforcollegeresourcesListView);

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
