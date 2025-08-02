import java.util.*;

class Loops{
    public static void main(String [] args){
        
        Scanner sc = new Scanner (System.in);
        
        // for loop
        for(int i = 0; i < 10; i++){
            System.out.print(i+" ");
        }
            
        System.out.print("\nEnter n: "); 
        int n = sc.nextInt();

        // Sum of n natural numbers
        int sum = 0;
        for(int i = 1; i <= n; i++ ){
            sum = sum+i;
        }
        System.out.print("Your sum is: " + sum + "\n");
        
        // Multiplication table of n
        for(int i = 1; i <= 10; i++){
            System.out.println(n + " * " + i + " = " + n * i);
        }

        sc.close();
    }
}