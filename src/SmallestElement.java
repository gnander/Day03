public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {50, 40, 30, 20, 10};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(" "+ min);
    }
}
