package mx.com.diossa.adeudosapp;

import android.os.Parcel;
import android.os.Parcelable;


/**
 * Created by JSALAS on 08/09/2017.
 */

public class Debt implements Parcelable {
    private String creditor ;
    private double total;
    private int months;
    private String date;

    public Debt(String creditor, double total,int months, String date){
        this.creditor = creditor;
        this.total = total;
        this.months = months;
        this.date = date;
    }

    public Debt(){
        super();
    }



    public Debt(Parcel parcel) {
        this.creditor = parcel.readString();
        this.total = parcel.readDouble();
        this.months = parcel.readInt();
        this.date = parcel.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.creditor);
        parcel.writeDouble(this.total);
        parcel.writeInt(this.months);
        parcel.writeString(this.date); 
    }

    public static final Creator<Debt> CREATOR = new Creator<Debt>() {
        @Override
        public Debt createFromParcel(Parcel parcel) {
            return new Debt(parcel);
        }

        @Override
        public Debt[] newArray(int i) {
            return new Debt[0];
        }
    };

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
