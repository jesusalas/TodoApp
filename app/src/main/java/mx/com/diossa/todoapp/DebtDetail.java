package mx.com.diossa.todoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DebtDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debt_detail);

        TextView response = (TextView)findViewById(R.id.txt_response);

        Bundle extras = getIntent().getExtras();

        String creditor = extras.getString("creditor");
        String total = extras.getString("total");
        String months = extras.getString("months");
        String date = extras.getString("date");

        response.setText(String.format("%s\n%s\n%s\n%s\n",creditor,total,months,date));


    }
}
