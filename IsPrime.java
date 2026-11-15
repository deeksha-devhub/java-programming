public class IsPrime {
    static boolean isPrime(int n){

        if(n <= 1){
            return false;
        }
        for(int i=2; i<= n/2; i++){
            if(n%i == 0){
                return false;
            }
        }
         return true;    
    }
    public static void main(String[] args){
           if(isPrime(4)){
            System.out.println("19 is prime");
           }else{
            System.out.println("Non prime");
           }
    } 
         
}
