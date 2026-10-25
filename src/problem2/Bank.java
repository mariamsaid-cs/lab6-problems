package problem2;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name){
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    //add a customer
    public void addCustomer(Customer c){
        boolean found = false;
        for(Customer customer : customers){
            if(customer.getName().equalsIgnoreCase(c.getName())){
                found = true;
            }
        }
        if(!found){
            customers.add(c);
        }
    }

    //add a transaction to an existing customer
    public void addTransaction(Customer c, Double transaction){
        boolean found = false;
        for(Customer customer : customers){
            if(customer.getName().equals(c.getName())){
                found = true;
            }
        }
        if(found){
            c.addTransaction(transaction);
        }else {
            System.out.println("we did not find this customer.");
        }
    }

    //print the list of customer
    public void printCustomer(String customerName){
        System.out.println("the transactions of : " + customerName);

        Customer c = null;
        for(Customer cust : customers){
            if(cust.getName().equalsIgnoreCase(customerName)){
                c = cust;
            }
        }
        if(c == null){
            System.out.println("the customer is not found.");
        }else{
            System.out.println("the transactions of : " + customerName);
            for(Double trans : c.getTransactions()){
                double value = trans;
                if(value > 0){
                    System.out.println("deposit : " + value);
                }else {
                    System.out.println("withdrawal : " + (-1)*value);
                }
            }
        }
    }
}
