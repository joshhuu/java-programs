import java.util.Scanner;

public class Checkgrade {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        char a=' ';
        if(marks>=30 && marks<=50){
            a='P';
        }
        else if(marks>50 && marks<80){
            a= 'B';
        }
        else if(marks>=80 && marks<=100){
            a='A';
        }
        else{
            a='F';
        }

        switch(a){
            
            case 'F':
                System.out.println("Fail");
                break;
            case 'P':
                System.out.println("Pass");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'A':
                System.out.println("A");
                break;   
        }
    }
}
