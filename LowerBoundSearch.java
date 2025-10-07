
import java.util.*;

public class LowerBoundSearch {
    public static int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 6, 8};

        int target1 = 6;
        int target2 = 5;
        int target3 = 9;

        System.out.println("Target = " + target1 + " → Index = " + lowerBound(arr, target1));
        System.out.println("Target = " + target2 + " → Index = " + lowerBound(arr, target2));
        System.out.println("Target = " + target3 + " → Index = " + lowerBound(arr, target3));
    }
}
