package mx.com.diossa.adeudosapp;

/**
 * Created by JSALAS on 08/09/2017.
 */

public class Debt  {
    private String creditor ;
    private double total;
    private int months;
    private String date;


    
    public String getCreditor() {
        return creditor;
    }

    public void setCreditor(String creditor) {
        this.creditor = creditor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
