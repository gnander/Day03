import java.util.HashSet;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 7, 3, 4, 5, 6};

        HashSet<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] == array[j]) {
                    duplicates.add(array[i]);
                }
            }
        }

        System.out.print("Duplicate elements in the array: ");
        for (int duplicate : duplicates) {
            System.out.print(duplicate + " ");
        }
    }
}
