package mx.com.diossa.adeudosapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by JSALAS on 28/07/2017.
 */

class TodoViewHolder extends RecyclerView.ViewHolder{

    private TextView titleTextView;


    public TodoViewHolder(View itemView) {
        super(itemView);
        this.titleTextView = (TextView)itemView.findViewById(R.id.todo_textview);
    }

    public void setTitleTextView(String title) {
        this.titleTextView.setText(title);
    }

    public String getTittleTextView(){
        return  this.titleTextView.getText().toString();
    }
}
