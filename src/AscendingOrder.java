public class AscendingOrder {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3, 9, 8, 45, 15};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("order:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
