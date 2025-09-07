package AdvanceDSA.Stacks;

import java.util.Stack;

public class PushAtBottom {

    public static void recursive(int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        recursive(data);
        s.push(top);
    }

    public static Stack <Integer> s = new Stack<>();

    public static void main(String[] args) {

        s.push(1);
        s.push(2);
        s.push(3);

        int data = 4;
        recursive(data);

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
