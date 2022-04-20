public class insertionsort {

    public static void main(String[] args) {

        System.out.println("Bubble Sort");
        int[] intArray = { -22, 20, 32, 54, 13, 4, 6 };
        printArray(intArray);
        // Enter sorting algorithm here
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];

            }

            intArray[i] = newElement;
        }

        // end of sorting algorithm
        System.out.println("Sorting....");
        printArray(intArray);

    }

    public static void printArray(int[] array) {
        System.out.println("Prinitng Array");
        System.out.println("----------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
