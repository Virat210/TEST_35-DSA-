import java.util.*;
public class UpperBoundSearch {
    public static int upperBound(int[] arr, int target) {
        int low = 0, high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= target) {
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
        int target2 = 7;
        int target3 = 8;
        int target4 = 9;

        System.out.println("Target = " + target1 + " → Index = " + upperBound(arr, target1));
        System.out.println("Target = " + target2 + " → Index = " + upperBound(arr, target2));
        System.out.println("Target = " + target3 + " → Index = " + upperBound(arr, target3));
        System.out.println("Target = " + target4 + " → Index = " + upperBound(arr, target4));
    }
}
