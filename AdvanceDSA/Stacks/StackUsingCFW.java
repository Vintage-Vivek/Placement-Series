package AdvanceDSA.Stacks;

import java.util.Stack;

public class StackUsingCFW {
    public static void main(String[] args) {
        
        Stack <Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()) {
            System.out.println(s.pop()+" hola");
        }
            
        // same output
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}
