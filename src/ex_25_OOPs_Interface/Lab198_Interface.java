package ex_25_OOPs_Interface;

public class Lab198_Interface {
    public static void main(String[] args) {

        Rectangle r1=new Rectangle();
        r1.calArea(2,4);

        Triangle t1=new Triangle();
        t1.calArea(3,5);

    }
}

class Rectangle implements Polygon{
    public void calArea(int length,int breadth){
        System.out.println("Area of Rectangle="+(length*breadth));

    }
}

class Triangle implements Polygon{
    public void calArea(int length,int breadth){
        System.out.println("Area of Triangle"+(0.5*(length+breadth)));
    }
}

interface Polygon{
     void calArea(int length,int breadth);
}