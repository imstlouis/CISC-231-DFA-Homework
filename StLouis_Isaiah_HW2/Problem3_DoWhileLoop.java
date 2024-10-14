import java.util.Scanner;
public class Problem3_DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int sum = 0;
        int i = 1;
        int num = scanner.nextInt();
        do { //do while loop instead.
            if (num != i) {
                if (num % i == 0) { //will be checking if there's any remainder between the number inputted and the number in the loop. The loop will continue while i is less than num
                    sum += i;
                }
            }
            i++;
        } while (i <= num);
        if (sum == num) {  // if all the values that had no remainder with num were added together and equal num, then that number is a perfect number
            System.out.println(num + " is a perfect number!");
        } else {
            System.out.println(num + " is a not perfect number!");
        }
    }
}