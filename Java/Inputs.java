import java.util.*;

class Sum{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Number 1");
        int a = sc.nextInt();
        System.out.println("Number 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum");
        System.out.println(sum);
        sc.close();
    }
}