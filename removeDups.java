import java.util.*;

public class removeDups {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        int foundDups = removeElements(nums, 3);
        System.out.println("Number of Dups found: " + foundDups);

    }

    public static int removeElements(int[] nums, int val) {
        List<String> stringList = new ArrayList<>();
        int numTimes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                System.out.println("Found Value");
                numTimes++;
            } else {
                stringList.add(String.valueOf(nums[i]));
            }
        }

        for (int j = 0; j < numTimes; j++) {
            stringList.add("_");
        }
        System.out.println("Printing stringList");
        System.out.println(stringList.toString());

        return numTimes;
    }

}
