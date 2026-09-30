package Arrays;

import java.util.Scanner;

public class GreatestElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a[] = {2,76,344,9,45,23,2,245,67,6};
        int greatest = sc.nextInt();

        for(int i=0;i<a.length;i++){
            if(a[i] > greatest)
             greatest = a[i];
        }
        
        System.out.println(greatest);
        sc.close();
    }
}
