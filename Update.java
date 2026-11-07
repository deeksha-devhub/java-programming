public class Update {
    static void update(int A[]){
        A[0] = 25;
    }
    public static void main(String[] args){
        int A[] = {20,45,53,33,60};
        update(A);
        System.out.println(A[0]);
    }
}
