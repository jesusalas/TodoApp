package mx.com.diossa.adeudosapp;

/**
 * Created by JSALAS on 21/07/2017.
 */

public class Todo {
    private String id;
    private String title;

    public Todo(){

    }

    public Todo(String id,String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
