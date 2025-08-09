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
    public static void main(String[] args) {
        // int n = 5;
        // printNumb(n);
        // printNumb2(n);
        printSum(1,5,0);
    }
}