package OOPS;

public class Polymorphism {

    public void printInfo() {
        System.out.println("Nothing passed type 1");
    }
    public void printInfo(String name) {
        System.out.println("Nothing passed type 1");
    }
    public void printInfo(int age) {
        System.out.println("Nothing passed type 1");
    }
    public void printInfo(String name, int age) {
        System.out.println("Nothing passed type 1");
    }
    public int printInfo(int age, String Name) {
        return age;
    }

    public static void main(String[] args) {
        
    }
}
