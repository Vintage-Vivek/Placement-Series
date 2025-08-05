import java.util.*;

public class FuncPractice {
    public static void main(String[] args) {
        // System.out.println(AvgCal());
        // System.out.println(OddSum());
        // System.out.println(GreatTwo());
        // System.out.println(Cur());
        // System.out.println(Vote());
        // InfinityLoop();
        // Tester();
        // System.out.println(raiseToPower());
        // System.out.println(GCD());
        Fibonaci();


    }
    static void Fibonaci(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a = 0, b = 1;
        
        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

    static int GCD(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        while (b != 0) {
            int r = a % b;  // r is the remainder
            a = b;
            b = r;
        }
        return a;
    }

    static int raiseToPower(){

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        int m = (int)Math.pow(x, n);

        return m;
    }

    static void Tester(){

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        int Zeros = 0;

        while(true){
            String input = sc.next();

            if(input.equalsIgnoreCase("Stop")){
                break;
            }

            int n = Integer.parseInt(input);
            
            if(n>0){
                positive++;
            } else if (n<0){
                negative++;
            } else if(n == 0){
                Zeros++;
            }

        }

        System.out.println(positive+" "+negative+" "+Zeros);
    }

    static void InfinityLoop(){

        int i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i>=0);

    }

    static boolean Vote(){

        @SuppressWarnings("resource")
        Scanner sc = new  Scanner(System.in);

        int age = sc.nextInt();

        if(age>=18){
            return true;
        } else {
            return false;
        }

    }
    static int Cur(){

        @SuppressWarnings("resource")
        Scanner sc = new  Scanner(System.in);

        int r = sc.nextInt();

        double cur = 2*3.14*r;

        return (int)cur;
    }
    static int GreatTwo(){

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            return a;
        } else if (a<b) {
            return b;
        } else {
            return 0;
        }
    }

    static int OddSum(){
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            sum += ((2*i)+1);
        }

        return sum;
    }

    static int AvgCal(){
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int total = a+b+c;

        int Average = total / 3;
        
        return Average;
    }
}
