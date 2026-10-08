package Arrays;

public class RightRotationArray {
    public static void main(String[] args){
        int arr[] = new int[7];
        arr[0]=1;
        arr[1]=2;
        arr[2]=4;
        arr[4]=7;
        arr[5]=9;
        int x = 6;
        int index = 3;
        for(int i=arr.length-1; i>index; i--){
            arr[i] = arr[i-1];
        
        }
        arr[index]=x;
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
