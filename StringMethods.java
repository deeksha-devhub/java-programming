package strings;

public class StringMethods {
    public static void main(String[] args){

        //to find string length
        String str1 = "Java Program";
        int length = str1.length();
        System.out.println("String length: "+length);

        //string to lowercase and uppercase
        String uppercase = str1.toUpperCase();
        String lowercase = str1.toLowerCase();
        System.out.println("UpperCase :"+uppercase+ " LowerCase: "+lowercase);

        //to trim the blank spaces
        String str2 = "    Welcome     ";
        String trim = str2.trim();
        System.out.println("After Trimmed the blank spaces: "+trim);

        //for substring
        String substring1 = str1.substring(0,4);
        String substring2 = str1.substring(5);
        System.out.println("Substring of Java Program: "+substring1);
        System.out.println("Substring of Java Program: "+substring2);

        //to replace a letter
        String str3 = "Walcome";
        String replace = str3.replace('a','e');
        System.out.println("Before: Walcome, After: "+replace);

        //starts and ends with
        String str4 = "www.linkedln.com";
        boolean startswith = str4.startsWith("wwww");
        System.out.println("StartsWith www: "+startswith);
        boolean endswith = str4.endsWith(".com");
        System.out.println("endsWith .com: "+endswith);

        //character at given index
        String str5 = "Java";
        int charAtIndex = str5.charAt(0);
        System.out.println("Character at index 0: "+charAtIndex);


    }
}
