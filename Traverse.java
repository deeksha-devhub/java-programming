package Arrays;
import java.util.Scanner;
public class Traverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n]; 
        int result;

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            result = arr[i];
            System.out.println("Traverse "+i+" : "+result+" ");
        }
        sc.close();
    }
}
