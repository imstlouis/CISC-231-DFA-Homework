public class Problem4{
    public static void main(String[] args){
        int j = 0;
        while (j <= 5){ // while j is less than 5, as this is going to be the number of columns.
            for (int i = 5; i >= j; i--){ // for loop will start at 5 as the first row has 5 stars, but after each iteration, it will go down by one
                System.out.print("*"); 
            }
            System.out.println();
            j++; 
        }
    }
}
