// import java.util.*;

class Patterns {
   public static void main(String[] args) {
    
    // Solid rectangle
    // for (int i = 0; i < 3; i++) {
    //     for (int j = 0; j < 4 ; j++) {
    //         System.out.print("* ");
    //     }
    //     System.out.println(" ");
    // }

    // System.out.println("\n\n");

    // Hollow Rectangle

    // int n = 4;
    // int m = 5;

    // for( int i = 1; i <= n; i++ ){
    //     for( int j = 1; j <= m; j++ ){
    //         if(i == 1 || j == 1 || i == n || j == m ){
    //             System.out.print("* ");
    //         } else {
    //             System.out.print("  ");
    //         }
    //     }
    //     System.out.println(" ");
    // }

    // Half pyramid
    // int n = 4;
    
    // for(int i = 1; i <= n; i++){
    //     for (int j = 1; j <= i; j++) {
    //         System.out.print("* ");
    //     }
    //     System.out.println(" ");
    // }

    // Inverted Half Pyramid

    int n = 4;

    for (int i = n; i >= 1; i--) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    

   } 
}
