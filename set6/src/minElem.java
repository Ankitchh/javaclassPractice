public class minElem {
    public static void main(String[] args) {

        int[] array = {10, 5, 20, 8, 25};

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                
                min = array[i];
            }
        }
        System.out.println("The maximum element in the array is: " + min);
    }
}
