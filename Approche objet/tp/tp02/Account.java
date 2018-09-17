import java.util.*;



public class Account {
    private double balance;
    private String id; //immuable
    private String name; //immuable
    private Set<Transaction> transactions;

    public Account(String id, String name) {
        this.balance = 0;
        transactions = new HashSet<Transaction>();
    }

    public double getBalance() {
        return balance;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        //TODO_3
    }

    public Set<Transaction> getTransactionSince(Date date) {
      //TODO_1
      //il faut retourner une copie
      //sinon on peut la modifier ultérieurement
      Set<Transaction> wanted_transactions = new HashSet<Transaction>();
      //depuis la date donnée à maintenant
      //copier les éléments dans le nouveau Set
      for(Transaction i: this){
        if(i.getDate()>date)
          wanted_transactions.add(i);
      }
      return wanted_transactions;
    }


    @Override
    public boolean equals(Object other) {
        if (other instanceof Account) {
            Account otherAccount = (Account) other;
            return this.id.compareTo(otherAccount.id) == 0;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.id);
    }

    @Override
    public String toString() {
        return "Account "+this.name+" (id="+this.id+"), balance = "+this.balance;
    }

}
