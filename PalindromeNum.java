package Loops;

public class PalindromeNum {
    public static void main(String[] args){
        int n = 122221;
        int m = n;
        int rev = 0;
        while(n > 0){
            int r = n % 10;
            n = n/10;
            rev = rev * 10 + r;
        }
        System.out.println(rev);

        if(rev == m){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
    
}
