package Arrays;

public class CopyingArray {
    public static void main(String[] args){
        int arr[] = {2,3,6,3,6,8};
        int b[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            b[i] = arr[i];
            System.out.print(b[i] + ",");
        }
        
    }
    
}
