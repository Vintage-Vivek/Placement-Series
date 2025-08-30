package OOPS;

// Base class
class Shape {
    public void area () {
        System.out.println("area");
    }
}

// Derived class // Single level
class Triangle extends Shape {
    public void area (int l, int h) {
        System.out.println((l*h)/2);
    }
}

// Multilevel inhertance
class EquilateralTriangle extends Triangle {
    public void area (int l, int h) {
        System.out.print("Equi ");
        System.out.println((1*l*h)/2);
    }
}

// Hierarchichal Inhertance
class Rectangle extends Shape {
    public void area (int l, int h) {
        System.out.println("Baby Recti... "+2*l*h);
    }
}

/*             Hybrid Inhertance

                     Shape
                       |
               -----------------
               |               |
               |               |
           Rectangle         Triangle
                               |
                               |
                      Equilateral Triangle    
*/

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(50,10);
        EquilateralTriangle t2 = new EquilateralTriangle();
        t2.area(50,10);
        Rectangle R1 = new Rectangle();
        R1.area(50,10);
    }
}
