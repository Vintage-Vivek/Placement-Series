package OOPS;

class Student {
    String name = "Viyan";
    int roll;
    public void printName() {
        System.out.println(name);
    }
    public void setRollNo(int roll) {
        // this.roll = roll; 
        System.out.println(roll);
        // System.out.println(this.roll);
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.printName();
        int roll = 45;
        S1.setRollNo(roll);

        // Student S2 = new Student();
        // S2.setRollNo(S2.roll);
    }
}
