class Value{
    int a=3;
    Value(int a){
        System.out.println(a);
        System.out.print(this.a); // this prints 3
    }
}

public class ParameterConstructor {
    public static void main(String[] args) {
        Value v = new Value(5);
    }
}
