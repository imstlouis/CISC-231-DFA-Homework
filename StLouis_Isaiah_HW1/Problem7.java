import java.util.Scanner;
public class Problem7
{
    public static void main(String[] args)
    {
        System.out.println("Enter a year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0 || (year % 100 == 0) && (year % 400 == 0))  // if the year inputted when divided by 4 has a remained of 0 or when divided by both 100 and 400 has a remainder of 0, then it is a leap year
        {
            System.out.println("The year " + year + " is a leap year");
        }
        else {
            System.out.println("The year " + year + " is not a leap year");
        }

    }
}
