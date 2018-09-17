import java.util.*;

public class Transaction {
    private Date date;
    private String title;
    private double amount;

    public Transaction(String title, double amount) {
        this.date = new Date(); //Affecter la date à aujourd'hui
        this.title = title;
        this.amount = amount;
    }

    public Date getDate() {
        return this.date;
    }

    public String getTitle() {
        return this.title;
    }

    public double getAmount() {
        return this.amount;
    }
}

//Date d = new Date(95,6, 12);//06/12/1995
//getTimt() -> donne le nome de secondes
