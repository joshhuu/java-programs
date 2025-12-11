import java.util.Scanner;
public class RollNo{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int rno= sc.nextInt();
        sc.nextLine();
        String name= sc.nextLine();

        System.out.println("Roll no:" + rno +",Name:" + name);
        System.out.printf("Roll no: %d,name:%s",rno,name);
    }

}