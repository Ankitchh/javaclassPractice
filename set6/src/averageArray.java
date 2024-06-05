
public class averageArray {
    public static void main(String[] args) {
        int[] arr ={56,66,76,67,89,56,89,46,88,96};
        int a=0;
        int count = 0;
        for(int elem:arr){
            a+=elem;
            count ++;
        }
        System.out.print("The average is "+(a/count));
    }
}
