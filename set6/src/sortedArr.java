public class sortedArr {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 3,4, 2, 1};

        boolean isSortedArray1 = true;
        boolean isSortedArray2 = true;


        for (int i = 0; i < array1.length - 1; i++) {
            if (array1[i] > array1[i + 1]) {
                isSortedArray1 = false;
                break;
            }
        }


        for (int i = 0; i < array2.length - 1; i++) {
            if (array2[i] < array2[i + 1]) {
                isSortedArray2 = false;
                break;
            }
        }


        if (isSortedArray1) {
            System.out.println("Array 1 is sorted");
        } else {
            System.out.println("Array 1 is not sorted");
        }

        if (isSortedArray2) {
            System.out.println("Array 2 is sorted");
        } else {
            System.out.println("Array 2 is not sorted");
        }
    }
}
