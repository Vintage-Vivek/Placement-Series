import java.util.*;

class Strings {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner (System.in);

        String name = sc.nextLine();
        String surName = sc.nextLine();

        String fullName = name + " " + surName;

        System.out.println(fullName);

        System.out.println("length : " + fullName.length());

        String a = "Hello";
        String b = "Cello";

        // S1 > S2  : +ve
        // S1 == S2 : 0
        // S1 < S2  : -ve

        if(a.compareTo(b) == 0){
            System.out.println("Equal");
        } else {
            System.out.println("Unequal");
        }

        String sentence = "I am Vivek";
        String subName = sentence.substring(5, 10);
        System.out.println(sentence.length());
        // substring(5, 10) 
        // substring(5) automaticlly takes last index
        // substring(5, 9) // last index is exclusive  

        System.out.println(subName);

    }
}
