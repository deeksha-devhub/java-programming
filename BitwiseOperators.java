public class BitwiseOperators {
    public static void main(String[] args) {

        //left shift operator
        int x1 = 10;
        int y1,y2;

        y1 = x1 << 1; //multipy x1 by 2
        y2 = x1 << 2; //multipy x1 by 4

        System.out.println("After left shift operation:");
        System.out.println(y1+" "+y2);


        //right shift operator
        int x2 = 10;
        int y3,y4;

        y3 = x2 >> 1; //divide x2 by 2
        y4 = x2 >> 2; //divide x2 by 4

        System.out.println("After right shift operation:");
        System.out.println(y3+" "+y4);

        //Not operation
        int x3 = 0b1010; //10
        int y5 = ~x3; //-11
        int y6 = x3>>>1; //5
        int y7 = y5>>>1; //2147483642

        System.out.println("After not operation:");
        System.out.println(+y5);
        System.out.println(+y6);
        System.out.println(+y7);
    }
    
}
