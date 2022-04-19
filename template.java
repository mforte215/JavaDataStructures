public class template {

    public static void main(String[] args) {

        System.out.println("Bubble Sort");
        int[] intArray = {-22, 20, 32, 54, 13, 4, 6};
        printArray(intArray);
        //Enter sorting algorithm here





        //end of sorting algorithm
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

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }


    
}
