package Arrays;

public class Subject {
    
    private int sub_id;
    private String name;
    private int maxMarks;
    private int marksObtained;

    public int getSub_id(){
        return sub_id;
    }
    public String getName(){
        return name;
    }
    public int getMaxMarks(){
        return maxMarks;
    }
    public int marksObtained(){
        return marksObtained;
    }

    public void setMaxMarks(int mm){
        maxMarks = mm;
    }
    public void setMarksObtained(int m){
        marksObtained = m;
    }

    public Subject(int sub_id, String name){
        this.sub_id = sub_id;
        this.name = name;
    }
    public Subject(int sub_id, String name, int maxMarks){
        this.sub_id = sub_id;
        this.name = name;
        this.maxMarks = maxMarks;
    }
    public Subject(int sub_id, String name, int maxMarks, int marksObtained){
        this.sub_id = sub_id;
        this.name = name;
        this.maxMarks = maxMarks;
        this.marksObtained = marksObtained;
    }

    boolean isQualified(){
        return marksObtained >= maxMarks / 10 * 4;
    }

    public String toString(){
        return "\nSubject ID: "+sub_id+"\nName: "+name+"\nmaxMarks: "+maxMarks+"\nmarksObtained: "+marksObtained;
    }
}
class Test{
    public static void main(String[] args){
        Subject subs[] = new Subject[3];
        subs[0] = new Subject(101, "Anu", 90,545);
        subs[1] = new Subject(102, "Anitha",91,552);
        subs[2] = new Subject(103, "Anuratha",97,578);

        for(Subject s: subs){
            System.out.println(s);
        }

    }
}

