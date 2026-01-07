class Father{
    void walk(){
        System.out.println("Walk");
    }
}

class Child1 extends Father{
    void cook(){
        System.out.println("Cook");
    }
}

class Child2 extends Father{
    void game(){
        System.out.println("Free Fire");
    }
}
public class Hierarichal {
    public static void main(String[] args) {
        System.out.println("Child 1:");
        Child1 c1 = new Child1();
        c1.walk();
        c1.cook();
        System.out.println("Child 2:");
        Child2 c2 = new Child2();
        c2.walk();
        c2.game();
    }
}
