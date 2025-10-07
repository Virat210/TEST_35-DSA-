import java.util.*;

public class CeilFinder {
    public static int findCeil(int[] arr, int target) {
        int low = 0, high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return (low < arr.length) ? arr[low] : -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 6, 8};

        int target1 = 5;
        int target2 = 9;
        int target3 = 6;
        int target4 = 0;

        System.out.println("Target = " + target1 + " → Ceil = " + findCeil(arr, target1));
        System.out.println("Target = " + target2 + " → Ceil = " + findCeil(arr, target2));
        System.out.println("Target = " + target3 + " → Ceil = " + findCeil(arr, target3));
        System.out.println("Target = " + target4 + " → Ceil = " + findCeil(arr, target4));
    }
}
