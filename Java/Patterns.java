// import java.util.*;

class Patterns {
    public static void main(String[] args) {

        // Solid rectangle
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 4 ; j++) {
        // System.out.print("* ");
        // }
        // System.out.println(" ");
        // }

        // System.out.println("\n\n");

        // Hollow Rectangle

        // int n = 4;
        // int m = 5;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= m; j++) {
        //         if (i == 1 || j == 1 || i == n || j == m) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println(" ");
        // }

        // System.out.println("\n\n");

        // Half pyramid

        // int n = 4;

        // for(int i = 1; i <= n; i++){
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println(" ");
        // }

        // System.out.println("\n\n");

        // Inverted Half Pyramid

        // int n = 4;

        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // System.out.println("\n\n");

        // Inverted Half Pyramid (Rotated 180*)

        // int n = 4;

        // for (int i = 1; i <= n; i++) {

        //     Spaces
        //     for (int j = 1; j <= n-i; j++) {
        //         System.out.print("  ");
        //     }
            
        //     Stars 
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }

        //     System.out.println(" ");
        // }

        // System.out.println("\n\n");

        // half pyramid with numbers

        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // Inverted half pyramid with numbers 

        // int n = 5;

        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // Floyd's triangle 

        // int n = 5;
        // int count = 1;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(count + " ");
        //         count++;
        //     }
        //     System.out.println();
        // }
        
        // 0-1 triangle 

        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         if( (i%2==0&&j%2==0)||(i%2!=0&&j%2!=0) ){
        //             System.out.print(1+" ");
        //         } else {
        //             System.out.print(0+" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // n = 4, Butterfly pattern 

        // int n = 4;

        // // upper half
        // for (int i = 1; i <= n; i++) {
            
        //     // 1st half
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }

        //     // Spaces
        //     int spaces = 2 * (n-i);
        //     for (int j = 1; j <= spaces; j++) {
        //         System.out.print("  ");
        //     }

        //     // 2nd Half 
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }
        // // Lower Half
        // for (int i = n; i >= 1; i--) {
            
        //     // 1st half
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }

        //     // Spaces
        //     int spaces = 2 * (n-i);
        //     for (int j = 1; j <= spaces; j++) {
        //         System.out.print("  ");
        //     }

        //     // 2nd Half 
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }

        // Solid Rhombus

        // int n = 5;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = n-1; j >= i; j--) {
        //         System.out.print(" ");
        //     }   
        //     for (int j = 1; j <= n; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }

        // Number pyramid
        
        int n = 5;
        int count = 1;

        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = 1; j <= i; j++) {
                // i that is no. of rows can be also used instead of count
                System.out.print(count+" ");
            }
            count++;
            System.out.println(" ");
        }
       
    }
}
