package mx.com.diossa.adeudosapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by SALAS on 03/09/2017.
 */

public class MainPerson extends Activity implements View.OnClickListener  {

    public static final String USERNAME = "user";
    public static final String LOG_TAG = "MainActivity Lifecycle";


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person_xml);

        Log.d(LOG_TAG,"On create");
        Button btn_calculate = (Button)findViewById(R.id.btn_calculate_debt);
        Button btn_exit = (Button)findViewById(R.id.btn_exit_dbt);
        Button btn_loggin = (Button)findViewById(R.id.btn_loggin_debt);
        final EditText salary = (EditText)findViewById(R.id.txt_salary);
        final TextView answer = (TextView)findViewById(R.id.answer);


        btn_exit.setOnClickListener(this);
        btn_loggin.setOnClickListener(this);

        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Person jesus = new Person("jesus","salas",24,60,1.62);
                Double salary_real = Double.parseDouble(salary.getText().toString());
                jesus.setWeight(salary_real);
                String person = getString(R.string.debt_answer) + jesus.calculateIMC() ;
                answer.setText(person);
            }
        });




    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG,"On Start");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG,"On Restart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG,"On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG,"On Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG,"On Pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG,"On Destroy");
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btn_exit_dbt:
                Intent crear_debt = new Intent(this, CreateDebtActivity.class);
                startActivity(crear_debt);
                break;
            case R.id.btn_loggin_debt:

                Intent login = new Intent(this, LoginActivity.class );
                login.putExtra(USERNAME,"jsalas");
                login.putExtra("pass","123");
                startActivity(login);
                break;

            default:
                Toast.makeText(getApplicationContext(),"No se oprimio ningun boton", Toast.LENGTH_SHORT).show();
        }

    }
}
