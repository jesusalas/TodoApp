package mx.com.diossa.todoapp;

import android.app.Application;
import android.util.Log;

import com.androidnetworking.AndroidNetworking;

/**
 * Created by JSALAS on 21/07/2017.
 */

public class TodoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AndroidNetworking.initialize(getApplicationContext());
        Log.d("APPLICATION","CLASE APPLICATION INICIALIZADA");
    }
}
