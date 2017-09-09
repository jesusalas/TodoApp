package mx.com.diossa.adeudosapp;

import android.content.Intent;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateDebtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_debt);

        final EditText creditor = (EditText)findViewById(R.id.txt_creditor);
        final EditText total = (EditText)findViewById(R.id.txt_total);
        final EditText months = (EditText)findViewById(R.id.txt_months);
        final EditText date = (EditText)findViewById(R.id.txt_date);
        Button create = (Button)findViewById(R.id.btn_create);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Debt deuda = new Debt();
                deuda.setCreditor(creditor.getText().toString());
                deuda.setTotal(Double.parseDouble(total.getText().toString()));
                deuda.setMonths(Integer.parseInt(months.getText().toString()));
                deuda.setDate(date.getText().toString());

                Intent detailActivity = new Intent (CreateDebtActivity.this,DebtDetail.class);
                /*
                createView.putExtra("total",total.getText().toString());
                createView.putExtra("months",months.getText().toString());
                createView.putExtra("creditor",creditor.getText().toString());
                createView.putExtra("date",date.getText().toString());
                */

              /*  createView.putExtra("creditor",deuda.getCreditor());
                createView.putExtra("total",deuda.getTotal());
                createView.putExtra("months",deuda.getMonths());
                createView.putExtra("date",deuda.getDate());*/

                detailActivity.putExtra("deuda",deuda);
                startActivity(detailActivity);
            }
        });
    }

}
