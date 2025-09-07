package AdvanceDSA.Stacks;

import java.util.Stack;

public class ReverseStack {
    
    public static void PushAtBottom(int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        PushAtBottom(data);
        s.push(top);
    }

    public static void reverse() {
        
        if(s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverse();
        PushAtBottom(top);
    }

    public static Stack <Integer> s = new Stack<>();

    public static void main(String[] args) {
        
        s.push(1);
        s.push(2);
        s.push(3);

        reverse();

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
