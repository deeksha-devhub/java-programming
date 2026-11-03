public class RunningSumOfArray {
    public static void main(String[] args){
        int[] arr = {1,3,3,4,5,7};
        int sum = 0;
        int[] result = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            result[i] = sum;
        }
        System.out.println("Running sum of the array:"+sum);
    }
}
