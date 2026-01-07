class Const{
    Const(){
        System.out.print("Constructor in Hall class");
    }
}

public class UsingConstructor {
    public static void main(String[]args){
        Const h = new Const();
        Const j = new Const();
    }
}
