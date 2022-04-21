import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Chevy");
        System.out.println(cars);
        // Get the first item
        String firstCar = cars.get(0);
        System.out.println(firstCar);
        // Change the second item
        cars.set(1, "GM");
        System.out.println(cars);
    }
}
