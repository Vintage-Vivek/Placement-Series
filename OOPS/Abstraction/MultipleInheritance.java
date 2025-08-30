package OOPS.Abstraction;

interface fishes {
    int eyes = 2;
    void swim ();
}

interface omnivore {
}

class starfish implements fishes, omnivore {
    static String school;

    public void swim () {
        System.out.println("Swiming........");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {
        starfish star = new starfish();
        star.swim();

        starfish.school = "pink see";
        System.out.println(starfish.school);

        // star.school = "pink see";
        // System.out.println(star.school);
    }
} 