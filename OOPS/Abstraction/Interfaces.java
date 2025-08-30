package OOPS.Abstraction;

interface flys {
    public void fly ();
}

class bee implements flys {
    public void fly () {
        System.out.println("flying...");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        bee b1 = new bee();
        b1.fly();
    }
}
