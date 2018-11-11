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

public class PreparingSpendingPlanQuiz extends AppCompatActivity {

    private static final boolean USE_FLAG = true;
    private static final int myFlag = Intent.FLAG_ACTIVITY_REORDER_TO_FRONT;

    private String[] QUESTIONNUMBER = {"1.", "2.", "3.", "4."};

    private String[] QUESTIONTITLE = {"Which of the following are examples of fixed expenses?", "What is the term for monthly income one receives BEFORE taxes are taken out?", "Which of the following is NOT an element of a good spending plan?", "What is an expense that one could cut back on if they find they are spending too much?"};

    private String[] OPTIONONE = {"Mortgage or Rent", "Gross income", "Reveals one’s financial condition by comparing income to expenses", "Fixed Utilities"};

    private String[] OPTIONTWO = {"Credit Card Bills", "Net income", "Helps avoid overspending and shows where one can save", "Entertainment"};

    private String[] OPTIONTHREE = {"Groceries", "Disposable income", "Puts all expenses in one large list", "Mortgage"};

    private String[] OPTIONFOUR = {"Gifts", "Adjusted income", "Helps one save for emergencies and anticipated needs", "Vehicle Loan"};

    private ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preparing_spending_plan_quiz);

        myListView = (ListView)findViewById(R.id.preparingSpendingListView);

        CustomAdapter customAdapter = new CustomAdapter();
        myListView.setAdapter(customAdapter);
    }


    class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return QUESTIONNUMBER.length;
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
            view = getLayoutInflater().inflate(R.layout.custom_quiz, null);

            TextView quesionNumber = (TextView)view.findViewById(R.id.quizNumber);
            TextView questionTitle = (TextView)view.findViewById(R.id.quizQuestion);
            TextView questionOptionOne = (TextView)view.findViewById(R.id.optionOne);
            TextView questionOptionTwo = (TextView)view.findViewById(R.id.optionTwo);
            TextView questionOptionThree = (TextView)view.findViewById(R.id.optionThree);
            TextView questionOptionFour = (TextView)view.findViewById(R.id.optionFour);

            quesionNumber.setText(QUESTIONNUMBER[i]);
            questionTitle.setText(QUESTIONTITLE[i]);
            questionOptionOne.setText(OPTIONONE[i]);
            questionOptionTwo.setText(OPTIONTWO[i]);
            questionOptionThree.setText(OPTIONTHREE[i]);
            questionOptionFour.setText(OPTIONFOUR[i]);

            return view;
        }
    }
}
