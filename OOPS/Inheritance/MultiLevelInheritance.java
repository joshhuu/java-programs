class Landline{
    void call(){
        System.out.println("Ring Ring Ring");
    }
}


class Button_phone extends Landline{
    void message(){
        System.out.println("Hi How are you?");
    }
}

class Smart_Phone extends Button_phone{
    void Game(){
        System.out.println("opening the game");
    }
}
public class MultiLevelInheritance  {
    public static void main(String[]args){
        Smart_Phone sp = new Smart_Phone();
        sp.call();
        sp.message();
        sp.Game();
    }
}

