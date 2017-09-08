package mx.com.diossa.todoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateDebtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_debt);

        final EditText total = (EditText)findViewById(R.id.txt_total);
        final EditText months = (EditText)findViewById(R.id.txt_months);
        final EditText creditor = (EditText)findViewById(R.id.txt_creditor);
        final EditText date = (EditText)findViewById(R.id.txt_date);
        Button create = (Button)findViewById(R.id.btn_create);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent createView = new Intent (CreateDebtActivity.this,DebtDetail.class);
                createView.putExtra("total",total.getText().toString());
                createView.putExtra("months",months.getText().toString());
                createView.putExtra("creditor",creditor.getText().toString());
                createView.putExtra("date",date.getText().toString());
                startActivity(createView);
            }
        });
    }

}
