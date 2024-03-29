package string;

public class StringManipulationExample {
    public static void main(String[] args) {

        // Using String Literal
        String str1 = "Hello ";
        System.out.println(str1);

        // Using String object
        String str2 = new String("World");
        System.out.println(str2);

        // Concatenating String Literal and String Object
        String str3 = str1+str2;
        System.out.println(str3);

        // String Methods
        System.out.println(str1.length());
        System.out.println(str2.charAt(0));
        System.out.println(str1.concat(str2));
        System.out.println(str3.substring(0,5));
        System.out.println(str1.equals(str2));
        System.out.println(str3.contains("Hello "));
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());
        System.out.println(str3.trim());
    }
}
