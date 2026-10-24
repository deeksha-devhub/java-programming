package strings;

public class StringConstructors {
    public static void main(String[] args) {
        String str1 = "Java program"; // literal- in pool
        System.out.println(str1);

        // constructors
        char[] c = { 'a', 'b', 'c', 'd' };
        String str2 = new String(c);
        System.out.println("char to string: " + str2);

        byte b[] = { 65, 66, 67, 68 };
        String str3 = new String(b);
        System.out.println("Byte to string : " + str3);

        String str4 = new String("Java");
        System.out.println("Created in both pool and heap: " + str4);

        String str5 = "Java";
        String str6 = "Java";
        System.out.println("In pool: " + (str5) + ", In same pool: " + (str6));
    }

}
