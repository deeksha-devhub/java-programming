public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String str = "     abc de fgh ijk  ";
        String result = str.replaceAll("\\s","");
        String result1 = str.replaceAll("\\s","").trim();
        System.out.println(result);
        System.out.println(result1);
    }
}
