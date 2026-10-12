package Arrays;
import java.util.Scanner;
public class JaggedArraySumEachRow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a[][];
        a = new int[3][];
        a[0] = new int[2];
        a[1] = new int[3];
        a[2] = new int[2];

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++ ){
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
            System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        for(int i=0; i<a.length; i++){
            int sum = 0;
            for(int j=0; j<a[i].length; j++){
                sum += a[i][j];
            }
            System.out.println("Sum of row" +(i+1) + ": " +sum);
        }

     sc.close();   
    }
}
