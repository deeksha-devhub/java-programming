package Arrays;
import java.util.Scanner;
public class JaggedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[][];
        a = new int[3][];
        a[0] = new int[2];
        a[1] = new int[3];
        a[2] = new int[2];

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                a[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Length");
        System.out.println(a.length);
        System.out.println(a[0].length);
        System.out.println(a[1].length);
        System.out.println(a[2].length);

    }
}
