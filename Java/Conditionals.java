import java.util.*;

class Conditionals{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a >= 18){
            System.out.println("Adult");
        } else {
            System.out.println("Younger");
        }

        if( a % 2 == 0 ){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        if( a == b ){
            System.out.println("Equal");
        } else if ( a > b ){
            System.out.println("A is Greater");
        } else {
            System.out.println("A is smaller");
        }

        switch (b) {
            case 1 : 
            System.out.println("RED");
            break;
            case 2 :
            System.out.println("GREEN");
            break;
            case 3 : 
            System.out.println("YELLOW");
            break;
            default : 
            System.out.println("Invalid");            
        }

        sc.close();
    }
}