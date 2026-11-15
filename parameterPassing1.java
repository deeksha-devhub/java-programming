public class parameterPassing1 {
    static int add(int x, int y){ //formal parameters (content of actual para.. copied)
        int z;
        z = x + y;
        return z;
    }
    public static void main(String[] args){
        int a=10, b=20, c;  
        c = add(a,b); //actual parameters
        System.out.println(c);
    }
}
