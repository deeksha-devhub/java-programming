public class ParameterPassing2 {
    static void welcome(String n){ //reference to string object
        System.out.println("Hello!! welcome "+n);
    }
    public static void main(String[] args){
        String name = "Victor"; //reference to object
        welcome(name);
    }
}
