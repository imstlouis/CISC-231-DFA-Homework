import java.util.Scanner;
public class Problem3_WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int sum = 0;
        int i = 1;
        int num = scanner.nextInt();
        while (i <= num) { // while i, which is num is less than the number inputted by the user, a loop will occur
            if (num != i){ // if the number inputted isn't equal to the loop value
                if (num % i == 0) { // it will check to see if there's any remainder
                    sum +=i; //if there isn't, that number will go into the sum variable
                }
            }i++;
        }
        if (sum == num){ // if all the values that had no remainder with num were added together and equal num, then that number is a perfect number
            System.out.println( num + " is a perfect number!");
        }
        else{
            System.out.println(num + " is a not perfect number!");
        }
    }
}