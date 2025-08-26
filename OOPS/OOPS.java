package OOPS;

class Pen { // By convention we take first letter of class as capital

    String color; // and for object and methods as small
    String type; // yeh hain properties of a object which exist in the class

    public void write() { // yeh ek method hai jo aapka object perform kar sakta hai
        System.out.println("Writing");
    }

    public void printColor() {
        System.out.println("Color "+ this.color);
        // this ki help se ham methods ko bata te hain ki
        // konse object ne use call kiya hai 
    }

}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

}

public class OOPS {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        // Yahan "new" ek keyword hai jo hamare object k liye heap me 
        // ek nayi memory us object k type ki allocate karta hai 
        // aur yeh "Student()" ek constructor hota hai jo objects ko 
        // construct karne me help karta hai
        s1.name = "Yana";
        s1.age = 2;

        s1.printInfo();
        
        // Pen pen1 = new Pen(); // pen type ka new object banaya memory me 
        //                       // jo ab class k sare features ko access kar payega
        
        // pen1.color = "Blue"; // yeh specific object ki properties define ki 
        // pen1.type = "Gel";

        // pen1.write(); // yeh uske actions ya features jo class ki help se woh kar
        //               // sakta hai, use... access kiya 

        // Pen pen2 = new Pen(); // yeh naya object bna na

        // pen2.color = "Black"; 

        // pen1.printColor(); 
        // pen2.printColor(); // naye object ki proprties ko access karna


    }
}
