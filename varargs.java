public class varargs {
    static void show(int...A){
        for(int x: A){
            System.out.println(x);
        }
    } 
    public static void main(String[] args){
        show(10,20,40);
        show(10);
        show(1,4,5,3,8,0,6);
        
    }
}
