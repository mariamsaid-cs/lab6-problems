package problem1;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int qty){
        this.name = name;
        this.price = price;
        this.quantity = qty;
    }
    //getters and setters
    public String getName(){return this.name;}
    public double getPrice(){return this.price;}
    public int getQuantity(){return this.quantity;}

    public void setName(String name){this.name = name;}
    public void setPrice(double price){this.price = price;}
    public void setQuantity(int qty){this.quantity = qty;}

    public double totalPrice(){
        return price * quantity;
    }

    //printing the item
    public void printItem(){
        System.out.println(name + " quantity : " + quantity + " price = " + price);
    }
}
