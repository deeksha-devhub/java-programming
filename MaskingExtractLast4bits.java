import java.util.Scanner;
public class MaskingExtractLast4bits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Masking - Last 4 bits
        int n = sc.nextInt();
        int mask = sc.nextInt();

        int result = n & mask;
        System.out.println("Last four bits = "+result);
        
        sc.close();
    } 
    
}

