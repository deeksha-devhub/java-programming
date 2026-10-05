package Arrays;

public class SecondLargest {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        int largest = arr[0];
        int SecondLargest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                SecondLargest = largest;
                largest = arr[i];    
            }
        }
        System.out.println("Second largest: "+SecondLargest);
    }
}
