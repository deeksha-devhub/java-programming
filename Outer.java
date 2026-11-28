package Inner_classes;

public class Outer {

    int x = 10;
    static int a = 5;
    class Inner{
        int y = 20;
        void innerDisplay(){
            System.out.println("InnerDisplay method");
            System.out.println(x);
            System.out.println(y);
        }
    }
    class Inner2{
        void display(){
            System.out.println(a); //or
            System.out.println(Outer.a);
        }
    }

  void outerDisplay(){
        Inner i = new Inner();
        System.out.println("Outer display method");
        i.innerDisplay();
        System.out.println(i.y);
  }
}
class NestedInnerClass{
    public static void main(String[] args){

        System.out.println("Outer class");
        Outer o = new Outer();
        o.outerDisplay();

        System.out.println("Inner class 1");
        Outer.Inner i = new Outer().new Inner();
        i.innerDisplay();

        System.out.println("Inner class 2");
        Outer.Inner2 i2 = new Outer().new Inner2();
        i2.display();
    }
}
