package constructors;

public class StudentDetails {
    private int s_id;
    private String name;
    private String dept;
    private String score;

    public StudentDetails(){
        s_id = 101;
        name = "shama";
        dept = "CSE";
        score = "80%";

    }
    public StudentDetails(int id, String n, String d, String s){
       s_id = id;
       name = n;
       dept = d;
       score = s;
    }
    public void details(){
       System.out.println(s_id);
       System.out.println(name);
       System.out.println(dept);
       System.out.println(score);
    }
}
class Test{
    public static void main(String[] args){
        StudentDetails s1 = new StudentDetails();
        StudentDetails s2 = new StudentDetails(102,"Durga","CSE","85%");
        System.out.println("S1 details :");
        s1.details();
        System.out.println("S2 details :");
        s2.details();
    }
}