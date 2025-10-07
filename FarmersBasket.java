public class FarmersBasket {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int key = 25;
        System.out.println(find(arr, key, 0));
    }

    static int find(int[] arr, int key, int i) {
        if (i == arr.length) return -1;
        if (arr[i] == key) return i;
        return find(arr, key, i + 1);
    }
}
