package Arrays;

public class DeletionInArray {
    public static void main(String[] args){
        int arr[] = {1,3,2,4,6,7};
        int index = 2;;
        for(int i=index; i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }

        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i] +" ");
        }
    }
    
}
