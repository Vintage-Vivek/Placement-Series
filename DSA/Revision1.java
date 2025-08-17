package DSA;

public class Revision1 {
    // recursion revision
    
    static void printNum(int n){
        if(n<=0) return;
        System.out.println(n);
        printNum(n-1);
    }

    static void printSum(int n, int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum += n;
        printSum(n-1,sum);
    }

    static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }

    static void fibonacci(int a, int b, int n){
        if(n==0){
            return;
        }
        System.out.print(a+" ");
        fibonacci(b, a+b, n-1);
    }

    static int xToPowN(int x, int n){
        if(n == 0 || x == 0) return 1;
        return x*xToPowN(x,n-1);
    }

    static int xToN(int x, int n){
        if (n == 0 || x == 0) {
            return 1;
        }
        int halfPower = xToN(x,n/2);
        if(n%2==0){
            return halfPower*halfPower;
        } else {
            return x*halfPower*halfPower;
        }
    }

    static void towerOfHanoi(int d, int src, int help, int des){

        

    }

    public static void main(String[] args) {
        // printNum(5);
        // printSum(5,0);
        // System.out.println(factorial(5));
        // fibonacci(0,1,7);
        // System.out.println(xToPowN(2,3));
        // System.out.println(xToN(2,3));
        
    }
}
