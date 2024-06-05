import java.util.Scanner;
public class array3d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1 [][][]=new int[3][3][3];
        System.out.println("Enter elements for Array");
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                for (int k=0;k<arr1[i][j].length;k++){
                    arr1 [i][j][k]= sc.nextInt();
                }
            }
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                for (int k=0;k<arr1[i][j].length;k++){
                    System.out.print(arr1[i][j][k]);
                    System.out.print(" ");
                }
                System.out.print("   ");
            }
            System.out.println(" ");
        }
    }
}
