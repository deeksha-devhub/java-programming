public class Rectangle {
    private int length;
    private int breadth;

    public void setLength(int l){
        length = l;
    }
    public void setBreadth(int b){
        breadth = b;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public int area(){
        return length*breadth;
    }
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        r.setLength(20);
        r.setBreadth(30);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());
        System.out.println(r.area());

    }
    
}



