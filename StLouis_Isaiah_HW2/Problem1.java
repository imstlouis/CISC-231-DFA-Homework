import java.util.Scanner;
public class Problem1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to end the loop, just input 0!"); //tells the user that inputting 0 will end the loop
        int loop_condition = 0;
        System.out.println("Enter how many numbers you want to input!: ");
        int num_count = scanner.nextInt();
        int sum = 0;
        while (loop_condition < num_count) //while the loop condition which is than the num count (number inputted by the user) it will continue to loop
        {
            System.out.println("Enter a number: ");
            int i = scanner.nextInt();
            sum += i; // sum will take all values entered into the scanner and add them together
            loop_condition++;
            if (i == 0){ //if i equals 0, the loop will end
                break;
            }

        }
        float average = ((float) sum / loop_condition); //have to convert to float as you could get a decimal answer
        System.out.println("The average of all your inputs is: " + average);
        System.out.println("the sum of all your inputs is: " + sum);
    }
}