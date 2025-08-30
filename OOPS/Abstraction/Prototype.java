package OOPS.Abstraction;

abstract class Animal {
    abstract void walk ();
}

class Horse extends Animal {
    public void walk () {
        System.out.println("Walks on 4 legs");
    }
}

class Duck extends Animal {
    public void walk () {
        System.out.println("Walks on two legs");
    }
}

public class Prototype {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}