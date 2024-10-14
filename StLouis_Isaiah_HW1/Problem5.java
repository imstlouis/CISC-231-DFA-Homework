import java.util.Scanner;
public class Problem5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Enter a number:");
            int nums = scanner.nextInt();
            if (nums % 2 == 0)  // checks to see if the number inputted when divided by 0 has a remainder of 0
            {
                System.out.println("The value that you inputted was even ");
            }
            else {
                System.out.println("The value that you inputted was odd ");
            }
        }


    }
}