package OOPS.Encapsulation.AnotherBank;

import OOPS.Encapsulation.Bank.Encapsulation;

public class SharingAcrossPackages {
    public static void main(String[] args) {
        System.out.println("Here is age from Sharing across packages - "+Encapsulation.age);
        // Encapsulation obj = new Encapsulation();
        // System.out.println(obj.age);
    }
}

// This was example of public acess modifier and using packages