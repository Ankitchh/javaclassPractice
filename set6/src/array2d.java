import java.util.Scanner;
public class array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1 [][]=new int[4][5];
        System.out.println("Enter elements for Array");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                 arr1 [i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
