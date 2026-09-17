import java.util.Scanner;
public class MaskingCheckBitONorOFF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //To check particular bit on or off
        System.out.println("Enter number:");
        int n = sc.nextInt(); //give number

        System.out.println("Enter which bit to check:");
        int mask = sc.nextInt(); //position(which bit)

        if( (n & mask) != 0){
            System.out.println(mask+" "+"position bit is ON");
        }else{
            System.out.println(mask+" "+"position bit is OFF");
        }
        sc.close();
    }
    
}
