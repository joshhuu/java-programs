public class Magicnumbe2 {
    public static void main(String[]args){
        int n =1729;
        int temp= n;
        int sum=0;
        int rev=0;
        while(n!=0){
            int digit= n%10;
            sum+=digit;
            n=n/10;
        }
        int m=sum;
        while(m!=0){
            int num= m%10;
            rev= rev*10 + num;
            m = m/10;
        }
        System.out.println(sum);
        System.out.println(rev);

        if(sum*rev == temp)
        System.out.println("magic number");
        else
        System.out.println("not magic number");
    }
}
