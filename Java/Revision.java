import java.util.*;

class Revision{
    public static void main(String[] args) {
        // tester();
        // raiseToPower();
        // gcd();
        // fibonacci();
        findX();

    }
    static void tester(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);    
        
        int pos = 0;
        int neg = 0;
        int zero = 0;
    
        while(true){
            String input = sc.nextLine();
        
            if(input.equalsIgnoreCase("Stop")){
                break;
            }

            int n = Integer.parseInt(input);

            if(n>0){
                pos++;
            } else if(n<0){
                neg++;
            } else {
                zero++;
            }
        
        }

        System.out.println(pos+" "+neg+" "+zero);
    
    }

    static void raiseToPower(){
        int n = 2;
        int m = 3;
    
        int x = (int) Math.pow(n,m);
        
        System.out.println(x);
        
    }

    static void gcd(){
        int n = 33;
        int m = 12;

        while(m != 0){
            int r = n % m;
            n = m;
            m = r; 
        }

        System.out.println(n);
    }

    static void fibonacci(){
        int n = 5;
        int a = 0 , b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a+" ");
            int next = a+b;
            a = b;
            b = next;
        }
    }

    static void findX(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] arr = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
           for (int j = 0; j < m; j++) {
            if(x == arr[i][j]){
                System.out.println("at ("+i+","+j+")");
            }
           } 
        }
    }
}