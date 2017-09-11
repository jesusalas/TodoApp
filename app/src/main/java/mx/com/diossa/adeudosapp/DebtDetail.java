package mx.com.diossa.adeudosapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DebtDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debt_detail);

        ListView debtListView = (ListView)findViewById(R.id.list_debt);

        Debt debt = (Debt)getIntent().getParcelableExtra("deuda");
        ArrayList<Debt> debtArrayList = new ArrayList<>();


        debtArrayList.add(debt);
        debtArrayList.add(new Debt("coppel",150,8,"2018"));

        DebtListAdapter debtListAdapter = new DebtListAdapter(this,R.layout.debt_item,debtArrayList);
        debtListView.setAdapter(debtListAdapter);

        


    }
}
