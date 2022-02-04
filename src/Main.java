public class Main
{

    public static void main(String[] args)
    {
	    double SALES_TAX = 0.05;
        double itemPrice = 9.00;
        double tax = 0;
        double totalPrice = 0;

        tax = itemPrice * SALES_TAX;
        totalPrice = tax + itemPrice;
        System.out.println("The price of the item is $" + itemPrice);
        System.out.println("The sales tax on the item is $" + tax);
        System.out.println("The total price of the item is $" + totalPrice);
    }
}
