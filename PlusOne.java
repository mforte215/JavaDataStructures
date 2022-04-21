import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        System.out.println("Starting Array: ");
        int[] startingArray = { 5, 7, 9, 9, 9, 9 };
        System.out.println(Arrays.toString(startingArray));
        int[] returnArray = plusOne(startingArray);
        System.out.println("Return array:");
        System.out.println(Arrays.toString(returnArray));
    }

    public static int[] plusOne(int[] digits) {
        // get the length of the array
        int n = digits.length;
        // iterate from the last digit to the first
        for (int i = n - 1; i >= 0; i--) {
            // if the current digit is less than a 9, just increment and move on
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // if it is a 9, change the digit to a zero

            digits[i] = 0;
        }

        // make a new array that is one space longer
        int[] newNumber = new int[n + 1];

        // make the index zero 1
        newNumber[0] = 1;

        return newNumber;
    }

}
