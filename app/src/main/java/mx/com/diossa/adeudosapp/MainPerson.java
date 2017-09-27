package mx.com.diossa.adeudosapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person_xml);

        Button btn_calculate = (Button)findViewById(R.id.btn_calculate_debt);
        Button btn_debt = (Button)findViewById(R.id.btn_see_debt);
        Button btn_exit = (Button)findViewById(R.id.btn_exit_debt);
        final EditText salary = (EditText)findViewById(R.id.txt_salary);
        final TextView answer = (TextView)findViewById(R.id.answer);


        btn_debt.setOnClickListener(this);
        btn_exit.setOnClickListener(this);

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
        Toast.makeText(getApplicationContext(),"creando ...", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"reiniciando ...", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"resumiendo ...", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"pausando ...", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"parando ...", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"saliendo ...", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btn_see_debt:
                Intent list_debts = new Intent(this, DebtDetail.class);
                startActivity(list_debts);
                break;
            case R.id.btn_exit_debt:
                Toast.makeText(getApplicationContext(),"Estas seguro que deseas salir?",Toast.LENGTH_SHORT).show();

            default:
                Toast.makeText(getApplicationContext(),"No se oprimio ningun boton", Toast.LENGTH_SHORT).show();
        }

    }
}
