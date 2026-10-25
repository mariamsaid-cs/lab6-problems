package problem2;
import java.util.ArrayList;
import java.lang.Double;

public class Customer {
    private String name;
    private ArrayList<Double> transactions ;

    public Customer(String name){
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public ArrayList<Double> getTransactions(){
        ArrayList<Double> copy = new ArrayList<>();
        for(Double trans : transactions){
            copy.add(trans);
        }
        return copy;
    }

    //add transaction
    public void addTransaction(Double transaction){
        transactions.add(transaction);
    }
}
