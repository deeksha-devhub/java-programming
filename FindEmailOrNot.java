public class FindEmailOrNot {
    public static void main(String[] args){
        String str = "deeks@gmail.com";
        int i = str.indexOf('@');
        String domain = str.substring(i+1,str.length());
        boolean result = domain.matches("gmail");
        if(result == true){
            System.out.println("Given string is gmail");
        }else{
            System.out.println("Given string is not gmail");
        }

        System.out.println("Another method :");
        String gmail = "deeksha@gmail.com";
        int index = gmail.indexOf('@');
        int index_2 = gmail.lastIndexOf('.') ;
        String domain_2 = gmail.substring(index+1,index_2);
        boolean result_2 = domain_2.matches("gmail");

        if(result_2 == true){
            System.out.println("Email");
        }else{
            System.out.println("Not an email");
        }
    
    }

}
