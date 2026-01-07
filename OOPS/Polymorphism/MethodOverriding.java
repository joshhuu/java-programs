class Car {
    void car(){
        System.out.println("It is a car");
    }
}
class Lambo {
    void car(){
        System.out.println("It is a Lamborghini");
    }
}
class Ferrari {
    void car(){
        System.out.println("It is a Ferrari");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Lambo l = new Lambo();
        l.car();
        Ferrari f = new Ferrari();
        f.car();
    }
}
