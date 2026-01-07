
final public class Main
{
	public static void main(String[] args) {
	    String str="Vasanth,Priyan,R";// String []arr=[vasa,pri,r]
	    System.out.println(str.length());
	    System.out.println(str.trim());
	    System.out.println(str.toUpperCase().trim());
	    System.out.println(str.substring(1,5));
	    System.out.println(str.contains("Vasanth"));
	    System.out.println(str.compareTo("Vasanth Priyan"));
	    System.out.println("str.startsWith(\"Vasan\") -> "+str.startsWith("Vasan"));
	    System.out.println("str.endsWith(\"yan\") -> "+str.endsWith("yan"));
	    System.out.println(str.indexOf('a')); //1
	    System.out.println(str.lastIndexOf('a')); 
	    String []arr=str.split(",");
	    for(String i : arr)
	    {
	        System.out.println(i);
	    }
	    String test="";
	    System.out.println(test.isEmpty());
	    String a="Hello";
	    String b = "World";
	    System.out.println(a+b);
	    System.out.println(a.charAt(0));//H
	    System.out.println(a.charAt(a.length()-1));//o
	    char []ch=a.toCharArray();//{'H','e','l','l','o'}
	    
	    for(char i : ch)
	    {
	        System.out.print(i);
	    }
	    
	}
}