package Arrays;

public class ReverseCopyingArray {
    public static void main(String[] args) {

        int arr[] = {2, 3, 5, 6, 8};
        int b[] = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            b[j] = arr[i];
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
