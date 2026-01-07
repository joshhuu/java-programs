public class MethodOverloading{
    static void add(int a){
        System.out.println("Integer value:"+a);
    }
    static void add(char a){
        System.out.println("Character value:"+a);
    }
    static void add(String a){
        System.out.println("String value:"+a);
    }
    public static void main(String[] args) {
        add("hello"); // if i give 'a' it will return character value and if 'hello' it'll restring value
    }
}