public class RemovespecialChar {
    public static void main(String[] args){
        String str = "a43vhj%*T$j0278";
        String result = str.replaceAll("[^0-9a-zA-Z]","");
        System.out.println(result);

    }
}
