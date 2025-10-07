public class HiddenChamber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(sum(arr, 0));
    }

    static int sum(int[] arr, int i) {
        if (i == arr.length) return 0;
        return arr[i] + sum(arr, i + 1);
    }
}
