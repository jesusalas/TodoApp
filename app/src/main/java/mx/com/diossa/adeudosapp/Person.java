package mx.com.diossa.adeudosapp;

/**
 * Created by SALAS on 03/09/2017.
 */

public class Person {
    private String name ;
    private String last_name;
    private int age;
    private double weight;
    private double height;

    public Person(String name, String last_name, int age, double weight, double height) {
        this.name = name;
        this.last_name = last_name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    Person(){};

    public double calculateIMC(){
        double result =  weight / (height * height);

        if (result < 0){
            result = 0;
        }

        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
