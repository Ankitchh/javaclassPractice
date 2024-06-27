public class method {
    static int sum(int x, int y){
        int z= x+y;
        return z;
    }
    int sub(int x, int y){
       int z=0;
        if (x>y){
            z= x-y;
        }
        else {
            z=y-x;
        }
        return z;
    } 
    public static void main(String[] args) {
        int a= sum(50,60);
        System.out.println(a);
        method obj= new method();

        int b= obj.sub(19,66);

        System.out.println(b);
    }
}
