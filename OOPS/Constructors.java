package OOPS;

class Student {
    String name;
    int age;

    // Student() {
    //     System.out.println("constructor called");
    // }

    // Student(String name, int age) {
    //     /* yeh name hai jo class me hamne likha hai */this.name = name; /* aur yeh name hai jo function aapne sath leke aaya hai */
    //     this.age = age;
    // }
     
    Student() {

    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }


}

public class Constructors {

    public static void main(String[] args) {
        
        // Student s1 = new Student();
        
        // s1.name = "Yana";
        // s1.age = 22;
        
        // Student s1 = new Student("Yana", 22);

        Student s1 = new Student();
        s1.name = "Yana";
        s1.age = 22;
        
        Student s2 = new Student(s1);
        s2.printInfo();

        // "s1" ki properties ko "s2" ko assign kar diya
        // this comes in handy to make copy of objects
        // const bana ke usme object pass kardiya 
        // aur is se usne object ki sari properties ko copy 
        // kar liya 
    }

}

// NOTES: -

        // Student(); This is a function 
        // but this is a special function 
        // which we name as CONSTRUCTOR
         
        // Java me constructors ka kaam hota hai 
        // java k objects ko construct karna

        // Constructors are of three types (3 TYPES)
        
        // Type 1: - Non permeterised constructors
        //           aise constructors jisme 
        //           parameters pass nahi kiye jate 

        // SOME PROPERTIES: -
        // 1 inka naam same as class hoga 
        // 2 yeh kuch return nahi karte
        //   (yeh methods/functions he hote hain)
        //   inka koi return type bhi nahi hota 
        //   jaise ki int, float ya kuch bhi, na he void
        // 3 ek constructor ko sirf jab he call kiya jata hai 
        //   jab woh object create kiya jata hai
        //   ise baar baar call nahi kiya jata
        // 4 agar ham koi un-parameterised constructor
        //   nahi banate hain toh java use kudh aapne liye bana
        //   leta hai jab ham object banate hain

        // Student (parameters) jo ham ek function
        // ko call karte time varibles dete hain 
        // unhe he parameters khete hain

        // Type 2: - Permeterised constructors

        // Type 3: - Copy constructors
        //           yeh concept c++ se aaya hai
        //           cpp me copy constructors aapne
        // aap initalise ho jate hain aur user ko 
        // bhi initalise karne padte hain
        
        // LEKIN - Java k andar copy const user ko he define
        // karne padte hain 

        // is ka seedha aur simple kaam yeh hai ki 
        // ek object ko copy karke dusre me daal dena

