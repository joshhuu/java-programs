import java.util.Scanner;

public class Perfectnumber{
    public static void main(String[]args){
      int number=8;
      int sum=0;
      for(int i=1;i<number;i++){
        if(number%i==0){
          sum+=i;
        }
      }
      if(sum ==number)
        System.out.println(number + "Perfect number");
      else 
        System.out.println(number + "not a Perfect number");
    }
}
