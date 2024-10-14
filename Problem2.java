import java.util.Scanner;
public class Problem2
{
    public static void main(String[] args)
    {
        float sales_tax = 0.05F; // 5 percent
        float county_salesTax = 0.025F; // 2.5 percent
        System.out.println("Enter the amount of your purchase: ");
        Scanner amount = new Scanner(System.in);
        float purchase_Amount = amount.nextFloat();
        float total_SalesTax = (sales_tax + county_salesTax); // Total sales tax alltogether.
        float total_Sale = (total_SalesTax * purchase_Amount) + purchase_Amount;
        System.out.println("Your sales tax is " + sales_tax + " and your county sales tax is " + county_salesTax);
        System.out.println("Your total sales tax is " + total_SalesTax + " and the total cost of the sale is " + total_Sale);

    }
}
