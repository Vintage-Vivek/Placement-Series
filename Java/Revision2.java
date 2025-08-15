// import java.util.Scanner;

public class Revision2 {
    static void switchCase(int n){
        switch(n){
            case 1: 
            System.out.println("Red");
            break;
            case 2: 
            System.out.println("Yellow");
            break;
            case 3: 
            System.out.println("Green");
            break;
            default: 
            System.out.println("Go");
        }
    }

    static void printSolidRect(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void invertedHalfPyramid180Degree(int n){
        
        for (int i = 1; i <= n; i++) {

            for (int k = n-i; k > 0; k--) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void butterfly(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void diamondPattern(int n){
        for (int i = 1; i < n; i++) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = n-i; j >= 1; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // @SuppressWarnings("resource")
        // Scanner sc = new Scanner (System.in);

        // int n = sc.nextInt();
        // switchCase(n);

        // printSolidRect(4);

        // invertedHalfPyramid180Degree(4);

        // butterfly(4);

        diamondPattern(4);

        


    }
}
