package Loops;

public class CountDigitsOfNum {
    public static void main(String[] args){
        int n = 2344;
        int i = 1;
        while (n>0) {
            System.out.println(i);
            i++;
            n=n/10;
        }
         
        System.out.println("Another method");
        int n1  = 4536;
        int count = 0;
        while(n1>0){
            n1=n1/10;
            count++;
            System.out.println(count);  //step by step output
        }
        System.out.println(count); //final output
        
    }
    
}
