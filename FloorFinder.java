import java.util.*;
public class FloorFinder {
    public static int findFloor(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int answer = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= target) {
                answer = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 8};

        int target1 = 5;
        int target2 = 0;
        int target3 = 6;
        int target4 = 9;

        System.out.println("Target = " + target1 + " → Floor = " + findFloor(arr, target1));
        System.out.println("Target = " + target2 + " → Floor = " + findFloor(arr, target2));
        System.out.println("Target = " + target3 + " → Floor = " + findFloor(arr, target3));
        System.out.println("Target = " + target4 + " → Floor = " + findFloor(arr, target4));
    }
}
