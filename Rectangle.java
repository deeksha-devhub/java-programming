package constructors;

public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(){
        length = 1;
        breadth = 1;
    }
    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
class Main{
    public static void main(String[] args){
        Rectangle r = new Rectangle();
        System.out.println(r.area());
        System.out.println(r.perimeter());

        Rectangle r1 = new Rectangle(10,5);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
}
