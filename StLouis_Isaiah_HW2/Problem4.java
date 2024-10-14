public class Problem4{
    public static void main(String[] args){
        int j = 0;
        while (j <= 5){ // while j is less than 5, as this is going to be the number of columns.
            for (int i = 5; i >= j; i--){ // for loop will start at 5 as the first row has 5 stars, but after each iteration, it will go down by one
                System.out.print("*"); // this was giving me so much trouble. I was putting println and the shape wouldn't be created. Had to get rid on ln because it was creating a new line
            }
            System.out.println();
            j++; // Also had trouble figuring out where to put the iteration for the while loop. but figured it out
        }
    }
}