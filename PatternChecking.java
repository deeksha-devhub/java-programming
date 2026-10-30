public class PatternChecking {
    public static void main(String[] args){
        String str = "java";
        System.out.println(str.matches("[a-z]+"));
        System.out.println(str.matches("[a|v|h]+"));

        String str1 = "00012";
        System.out.println(str1.matches("[0-2]+"));
        System.out.println(str1.matches("[02]+"));

        String str3 = "Java";
        System.out.println(str3.matches("[^bcdw]+"));

        String str4 = "Anu007";
        System.out.println(str4.matches("[a-z0-9]*"));

        String str5 = "1";
        System.out.println(str5.matches("[0|1]*"));
        System.out.println(str5.matches("[1]+"));

        String str6 = "01java";
        System.out.println(str6.matches("[0-1][0-1][a-z]*"));

        String str7 = "010101";
        System.out.println(str7.matches("[01]+"));
    }
}
