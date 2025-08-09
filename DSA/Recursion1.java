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
    public static void main(String[] args) {
        int n = 1;
        // printNumb(n);
        printNumb2(n);
    }
}