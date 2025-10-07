public class AncientScroll {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8};
        int key = 7;
        System.out.println(search(arr, key, 0));
    }

    static int search(int[] arr, int key, int i) {
        if (i == arr.length) return -1;
        if (arr[i] == key) return i;
        return search(arr, key, i + 1);
    }
}
