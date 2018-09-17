import java.util.*;

public class Transaction {
    private String date;
    private String title;
    private double amount;

    public Transaction(String title, double amount) {
        //Affecter la date à aujourd'hui
        this.title = title;
        this.amount = amount;
    }

    public String getDate() {
        return this.date;
    }

    public String getTitle() {
        return this.title;
    }

    public double getAmount() {
        return this.amount;
    }
}
