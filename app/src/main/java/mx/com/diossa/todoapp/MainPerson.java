package mx.com.diossa.todoapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by SALAS on 03/09/2017.
 */

public class MainPerson extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person_xml);

        Button btn_calculate= (Button)findViewById(R.id.btn_calculate_debt);
        final TextView response = (TextView)findViewById(R.id.response);

        btn_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Person jesus = new Person("jesus","salas",24,60,50);

                Toast.makeText(getApplicationContext(),response.getText() ,Toast.LENGTH_SHORT).show();
                double olvidar = Double.parseDouble(response.getText().toString());
                jesus.setWeight(olvidar);


                String person = "El maximo de deudas soportadas son " + jesus.calculateIMC();
                response.setText(person);
            }
        });




    }

}
