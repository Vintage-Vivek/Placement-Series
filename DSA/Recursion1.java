package DSA;

class Recursion1{
    static void printNumb(int n){
        if(n == 0) return;
        System.out.println(n);
        printNumb(n-1);
    }
    static void printNumb2(int n){
        if(n == 6) return;
        System.out.println(n);
        printNumb2(n+1);
    }
    static void printSum(int i, int n, int sum){
        if( i == n){
            sum += i; 
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1, n, sum);
        System.out.println(i);
    }

    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*factorial(n-1);
    }

    static void fibonacci(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        fibonacci(b,c,n-1);
    }

    static int calcPower(int x,int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 1;
        }
        // Type 1
        // int xPowNm1 = calcPower(x,n-1);
        // int xPowN = x*xPowNm1;
        // return xPowN;
        // Type 2
        return x*calcPower(x,n-1);
    }

    static int calPow(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int halfPower = calPow(x,n/2);
        if(n%2==0){
            return halfPower*halfPower;
        } else {
            return halfPower*halfPower*x;
        }
    }

    public static void main(String[] args) {
        // int n = 5;
        // printNumb(n);
        // printNumb2(n);
        // printSum(1,5,0);
        // System.out.println(factorial(5));
        /* int a = 0;
        int b = 1;
        int n = 7;
        System.out.println(a);
        System.out.println(b);
        fibonacci(a,b,n-2); */
        // System.out.println(calcPower(2, 5));
        System.out.println(calPow(2, 5));

    }
}