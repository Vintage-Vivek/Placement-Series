import java.util.*;

class Functions{
    public static void main(String[]args){
        // printMyName();
        // System.out.println(twoSum());
        // System.out.println(twoMul());
        System.out.println(fact());
    }
    static void printMyName(){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);
        sc.close();
    }
    static int twoSum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        return a+b;
    }
    static int twoMul(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        return a*b;
    }
    static int fact(){
        Scanner sc = new Scanner(System.in);
        int Fact = 1;
        int a = sc.nextInt();
        if(a == 1 || a == 0){
            return 1;
        } else if(a < 0){
            return 0;
        } else {
            for(int i = 1; i <= a; i++){
                Fact *= i;
            }
            return Fact;
        }
    }

}