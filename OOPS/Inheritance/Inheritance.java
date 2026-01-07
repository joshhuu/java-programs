class Button_phone{
    void call(){
        System.out.println("Ring Ring Ring");
    }
}

class Smart_Phone extends Button_phone{
    void message(){
        System.out.println("Hi How are you?");
    }
}
public class Inheritance {
    public static void main(String[]args){
        Smart_Phone sp = new Smart_Phone();
        sp.call();
        sp.message();
    }
}
