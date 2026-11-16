public class MethodOverloading {
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args){
        int result1 = add(3, 7);
        System.out.println(result1);
        int result2 = add(3, 7,6);
        System.out.println(result2);
    }
}
