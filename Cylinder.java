package constructors;

public class Cylinder {
    private int radius;
    private int height;

    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public void setRadius(int r){
        radius = r;
    }
    public void setHeight(int h){
        height = h;
    }
    public Cylinder(){
       radius = 1;
       height = 1;
    }
    public Cylinder(int r){
        radius = r;
        height = 5;
    }
    public Cylinder(int r, int h){
        radius = r;
        height = h;
    }
    public double lidArea(){
        return Math.PI *radius*radius;
    }
    public double volume(){
        return lidArea() * height;
    }
}
class Test{
    public static void main(String[] args){
        Cylinder c1 = new Cylinder();
        Cylinder c2 = new Cylinder(2);
        Cylinder c3 = new Cylinder(2,4);

        System.out.println(c1.lidArea());
        System.out.println(c2.lidArea());
        System.out.println(c3.lidArea());
        System.out.println(c1.volume());
        System.out.println(c3.volume());
        
    }

}
