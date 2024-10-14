import java.util.Scanner;
public class Problem3_ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int sum = 0;
        int num = scanner.nextInt();
        for (int i= 1; i <= num; i++) { // for loop instead. Will loop through all the numbers less than or equal to the number inputted by the user
            if (num != i){
                if (num % i == 0) {
                    sum +=i;
                }
            }
        }
        if (sum == num){  // if all the values that had no remainder with num were added together and equal num, then that number is a perfect number
            System.out.println( num + " is a perfect number!");
        }
        else{
            System.out.println(num + " is a not perfect number!");
        }
    }
}

