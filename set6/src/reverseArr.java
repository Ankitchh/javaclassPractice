public class reverseArr {
    public static void main(String[] args) {
        int [] arr={23,34,5435,23,5,2,3,46,56};
        int a = arr.length;
        int b=0;

        for (int i=a-1;i>=0;i--){
           b= arr[i];
            System.out.print(b+" ");
        }

    }
}
