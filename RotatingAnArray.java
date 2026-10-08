package Arrays;

public class RotatingAnArray {
    public static void main(String[] args){
        int arr[] = {1,3,5,7,8,9};
        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;

        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
        }
    }
}
