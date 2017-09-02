package mx.com.diossa.todoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;
import com.androidnetworking.interfaces.ParsedRequestListener;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    private static final String IP_SERVER = "http://172.16.1.109:5000";
    private static final String GET_TODO = "/api/todo";

    //@BindView(R.id.todo_recyclerview)
    private RecyclerView todoRecyclerView;

    @Override
    protected void onStart() {
        super.onStart();
        fetchTodoList();
    }

    private void fetchTodoList() {
        AndroidNetworking.get(IP_SERVER + GET_TODO)
                .setPriority(Priority.MEDIUM)
                .build()
                .getAsObjectList(Todo.class, new ParsedRequestListener<ArrayList<Todo>>() {

                    @Override
                    public void onResponse(ArrayList<Todo> response) {
                        TodoAdapterRecyclerView adapter = new TodoAdapterRecyclerView(response , R.layout.cardview_todo);
                        todoRecyclerView.setAdapter(adapter);
                    }

                    @Override
                    public void onError(ANError anError) {
                        anError.printStackTrace();
                        Toast.makeText(MainActivity.this,anError.getMessage(), Toast.LENGTH_LONG).show();
                    }
                });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //   ButterKnife.bind(this);
        setupRecyclerView();

    }

    private void setupRecyclerView() {
        todoRecyclerView = (RecyclerView)findViewById(R.id.todo_recyclerview);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        this.todoRecyclerView.setLayoutManager(linearLayoutManager);

    }


}
