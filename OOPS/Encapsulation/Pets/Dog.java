package OOPS.Encapsulation.Pets;

import OOPS.Encapsulation.TestAnimal.Animal;

public class Dog extends Animal{
    public void test () {
        eats();
    }
    public static void main(String[] args) {
        Dog D = new Dog();
        D.test();
    }
}
