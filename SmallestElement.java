package Arrays;
import java.util.Scanner;
public class SmallestElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a[] = {2,76,344,9,45,23,2,245,67,6};
        int smallest = sc.nextInt();

        for(int i=0;i<a.length;i++){
            if(a[i] < smallest)
             smallest = a[i];
        }
        
        System.out.println(smallest);
        sc.close();
    }
    
    
}
