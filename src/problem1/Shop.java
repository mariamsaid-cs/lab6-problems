package problem1;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList<>();
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            // *** create a new item and add it to the cart
            cart.add(new Item(itemName, itemPrice, quantity));
            // *** print the contents of the cart object using println
            double total = 0;
            System.out.println("the content of the shoping cart : ");
            for(Item x : cart){
                x.printItem();
                total += x.totalPrice();
            }
            System.out.println("the total price of the cart is: " + total);
            scan.nextLine();// if we didn't add it it will exit automatically because the buffer still contain smt.
            System.out.print ("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
        }
        while (keepShopping.equals("y"));
    }
}
