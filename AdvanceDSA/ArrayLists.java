package AdvanceDSA;

import java.util.ArrayList;
import java.util.Collections;
 
public class ArrayLists {
    public static void main (String [] args) {

        ArrayList <Integer> List = new ArrayList<>();
        
        // Adding elements
        List.add(0);
        List.add(1);
        List.add(3);

        // Printing
        // System.out.println(List);

        // // Getting index
        // System.out.println("val idx1: "+List.get(1));

        // // Adding in between
        // List.add(2,2);
        // System.out.println(List);

        // // Set value
        // List.set(0,5);
        // System.out.println(List);

        // // Delete  element 
        // List.remove(0);
        // System.out.println(List);

        // // Get Size
        // int size = List.size();
        // System.out.println(size);

        // // Loops
        // for (int i = 0; i < size; i++) {
        //     System.out.print(List.get(i)+" ");
        // }

        // Sorting 
        List.add(1,30);
        List.add(9);
        List.add(2,20);
        System.out.println(List);
        Collections.sort(List);
        System.out.println(List);

        


    }
}