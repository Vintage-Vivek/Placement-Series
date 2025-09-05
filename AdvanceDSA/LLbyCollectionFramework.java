package AdvanceDSA;

import java.util.*;

public class LLbyCollectionFramework {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList<>();

        // list.addFirst("a");
        // list.addFirst("is");
        
        // list.add("list");
        
        // or list.addLast("list"); same

        // list.addFirst("This");

        // int size = list.size();
        // System.out.println(size);

        // for (int i = 0; i < size; i++) {

            // Searching

            // if(list.get(i)=="yes"){
            //     System.out.println("yes");
            // }



            // System.out.print(list.get(i)+"->");            
        // }
        // System.out.println("Null");

        // list.removeFirst();
        // list.removeLast();

        // list.remove(3);
        
        // System.out.println(list);

        list.add("This");
        list.add("is");
        list.add("a");
        list.add("list");

        System.out.println(list);

        Collections.reverse(list);
            
        System.out.println(list);
        
    }
}

