import java.util.Scanner;
public class Problem3
{
    public static void main(String[] args)
    {
        float tax_rate = 0.07F; // convert to float to be used
        System.out.println("Enter the total amount of purchase: ");
        Scanner scanner = new Scanner(System.in);
        float total_Amount = scanner.nextFloat();
        float final_Amount = (total_Amount * tax_rate) + total_Amount;
        System.out.println("Enter (true) or (false) if the product is being shipped to New York: ");
        boolean question = scanner.nextBoolean();
        if (question) // if question == true
        {
            float shipping_cost = 9.99F; // convert to float to be used
            float total_Amount_AfterShipping = final_Amount + shipping_cost;
            System.out.println("Because you are shipping to New York, there is an additional shipping cost!");
            System.out.print("The total cost will be " + total_Amount_AfterShipping);
        }
        else
        {
            System.out.println("Your total cost will be " + final_Amount);
        }
    }
}
