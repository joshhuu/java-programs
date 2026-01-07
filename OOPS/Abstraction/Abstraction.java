abstract class Demo{
    abstract void hi();
}

class Hall extends Demo{
    void hi(){
        System.out.println("Abstract Method");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Hall h = new Hall();
        h.hi();
    }
}
