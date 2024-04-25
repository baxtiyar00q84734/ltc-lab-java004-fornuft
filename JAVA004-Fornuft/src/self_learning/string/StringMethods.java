package self_learning.string;

public class StringMethods {
    public static void main(String[] args) {

        String name="Bakhtiyar";

        System.out.println(name.equals("B"));
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name.equalsIgnoreCase("bakhtIYAR"));
        // does not matter upper or lower case is always check just letters

        System.out.println(name.charAt(4));
        // which char at given index

        System.out.println(name.codePointAt(4));
        //code for char at given index

        System.out.println(name.isEmpty());// if we have space it is empty
        System.out.println(name.isBlank());// if we have space return true

        System.out.println(name.replace("k","K"));

        String str = "   Hello, world!   ";
        String trimmedStr = str.trim();
        System.out.println(trimmedStr); // Output: "Hello, world!"

        String str2 = " \u2005\u2006 Hello, world! \u2006\u2005 ";
        String strippedStr = str2.strip();
        System.out.println(strippedStr); // Output: "Hello, world!"

        //strip() is more powerful as it not only removes ASCII whitespace but also Unicode whitespace characters.


    }
}
