public class OddNumPrinting {
    public static void main(String[] args) {
        int a= 1;
        System.out.print(a+",");
        for (int i = 1; i<10;i++){

            int ans=a+2;
            System.out.print(ans+",");
            a=ans;
        }
    }
}
