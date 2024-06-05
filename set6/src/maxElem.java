public class maxElem {
    public static void main(String[] args) {

        int[] array = {10, 5, 20, 8, 25};

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The maximum element in the array is: " + max);
    }
}
