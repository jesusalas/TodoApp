package mx.com.diossa.adeudosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DebtDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debt_detail);

        TextView response = (TextView)findViewById(R.id.txt_response);

       /* Bundle extras = getIntent().getExtras();

        String creditor = extras.getString("creditor");
        Double total = extras.getDouble("total");
        int months = extras.getInt("months");
        String date = extras.getString("date");*/

        Debt debt = (Debt)getIntent().getParcelableExtra("deuda");

        //response.setText(String.format("%s\n%s\n%s\n%s\n",creditor,total,months,date));
        response.setText(String.format("%s\n%s\n%s\n%s\n",debt.getCreditor(),debt.getTotal(),debt.getMonths(),debt.getDate()));
        //response.setText(String.format("%s\n%s\n%s\n%s\n","hola","me","andas","cagando"));


    }
}
