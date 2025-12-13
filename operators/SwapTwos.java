public class SwapTwos {
    public static void main(String[]args){
        int m =10;
        int n= 20;
        m= m+n;
        n= m-n;
        m=m-n;

        System.out.printf("%d%d",m,n);
    }
}
