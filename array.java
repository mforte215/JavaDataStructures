import java.util.*;

class ArrayDemo {

    public static void main(String[] args) {
        //create array 
        int[] prices = new int[5];
        System.out.println("Enter 5 Integers:");
        Scanner scanner = new Scanner(System.in);
        //fill array with scanner input
        for(int i = 0; i < prices.length; i++) {
            prices[i] = scanner.nextInt();
        }

        //print array
        System.out.println("Printing Enter Numbers");
        for (int j = 0; j < prices.length; j++) {
            System.out.println(prices[j]);
        }
    }
}