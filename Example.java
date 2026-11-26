abstract public class Example {

    void Super() {
        System.out.println("Super");
    }

    void meth1() {
        System.out.println("Super Method1");
    }

    abstract void meth2();
}

class Sub extends Example { // concrete class
    @Override
    void meth2() {
        System.out.println("Sub method2");
    }

    void meth3() {
        System.out.println("sub method3");
    }
}

class Test {
    public static void main(String[] args) {
        // abstract (super) not have an object
        // only have a reference
        Example e;

        // Dynamic method dispatch
        // methods in super class only can be called
        e = new Sub();
        e.Super();
        e.meth1();
        e.meth2();

    }
}
