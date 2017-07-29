package mx.com.diossa.todoapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by JSALAS on 28/07/2017.
 */

public class TodoAdapterRecyclerView extends RecyclerView.Adapter<TodoViewHolder> {
    private ArrayList<Todo> todoArrayList;
    private int resource;

    public TodoAdapterRecyclerView(ArrayList<Todo> data, int resource) {
        this.todoArrayList = data;
        this.resource = resource;
    }

    @Override
    public TodoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(this.resource,parent,false);
        return new TodoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TodoViewHolder holder, int position) {
        holder.setTitleTextView(todoArrayList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return this.todoArrayList.size();
    }
}
