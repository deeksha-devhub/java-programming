import java.util.Scanner;

public class highestAltitude {
    static void findHighestAltitude(int gain[]) {
        int highest_altitude = 0;
        int altitude = 0;
        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            if (altitude > highest_altitude) {
                highest_altitude = altitude;
            }
        }
        System.out.println(highest_altitude);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findHighestAltitude(arr);
        sc.close();
    }

}
