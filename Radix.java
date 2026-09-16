import java.util.Scanner;
public class Radix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String num=sc.nextLine();

        if(num.matches("[0-1]+")){
            System.out.println("Binary Radix = 2");
        }else if(num.matches("[0-7]+")){
            System.out.println("Octal radix = 8");
        }else if(num.matches("[0-9]+")){
            System.out.println("Decimal radix = 10");
        }else if(num.matches("[0-9,A-F]+")){
            System.out.println("Hexa radix = 16");
        }else{
            System.out.println("Invalid number");
        }
        sc.close();
    }
}
