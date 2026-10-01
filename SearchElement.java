package Arrays;
import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] arr = {1,2,3,4,5};
    int target = 3;
    
    for(int i=0; i<arr.length; i++){
        if(arr[i]==target){
            System.out.println("Element found");
            break;
        }else{
            System.out.println("Element not found");
        }
        sc.close();
       }
    }
}