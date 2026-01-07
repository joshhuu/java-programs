public class Armstrongnumber {
    public static void main(String[]args){
        int n=153;
        int temp=n;
        
        int cube=0;
        while (n!=0) {
            int digit= n%10;
            cube+= digit*digit*digit;
            n=n/10;
        }
        System.out.println(cube);

        if(cube == temp)
            System.out.println("It is a armstrong number");
        else
            System.out.println("It is a armstrong number");
    }
    
}
