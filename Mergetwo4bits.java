import java.util.Scanner;
public class Mergetwo4bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 5; //0101
        int b = 3; //0011
        int result_1 = (a<<4) | b; //0101 0011
        
        System.out.println(+result_1);
        System.out.println(Integer.toBinaryString(result_1));

        int result_2 = a | (b<<4);  //0011 0101
        
        System.out.println(+result_2);
        System.out.println(Integer.toBinaryString(result_2));
        
        sc.close();
    } 
    
}


