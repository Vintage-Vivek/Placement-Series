import java.util.Scanner;

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

    static int sumOfOdd(int n){
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += ((2*i)+1);
        }
        return sum;
    }

    static void countNum(){
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner (System.in);
        int zero = 0;
        int pos = 0;
        int neg = 0;
        while(true){
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("Stop")) break;
            int n = Integer.parseInt(input);
            if(n<0)  neg++;
            if(n>0)  pos++;
            if(n==0) zero++;
        }
        System.out.println("Negative = "+neg+", positive = "+pos+", zeros = "+zero);
    }

    static void calGcd(int a, int b){
        int r = 0;
        while(b!=0){
            r = a%b;
            a = b;
            b = r;
        }
        System.out.println(a);
    }

    static void fibonacci(int n){
        int a = 0;
        int b = 1;
        int count = 3;
        System.out.print(a+","+b);
        while(count<=n){
            int c = a + b;
            a = b;
            b = c;
            System.out.print(","+c);
            count++;                
        }

    }

    static void factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }

    static void findX(){
        int [][] arr = {{1,3,5},
                        {9,7,8}};
        int n = 7;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] == n) 
                System.out.println(i+","+j);
            }
        }
    }

    static void getBit(){
        int n = 5;
        int pos = 3;
        int bitMask = 1 << pos;
        if((bitMask & n) == 0){
            System.out.println("Bit is 0");
        } else {
            System.out.println("bit was 1");
        }
    }
    static void setBit(){
        int n = 5;
        int pos = 3;
        int bitMask = 1 << pos;
        int newNum = bitMask | n;
        System.out.println(newNum);
    }

    // Get bit at given position (0-based)
    static int getBit(int n, int pos) {
        int bitMask = 1 << pos;
        return (n & bitMask) == 0 ? 0 : 1;
    }

    // Set bit at given position (0-based)
    static int setBit(int n, int pos) {
        int bitMask = 1 << pos;
        return n | bitMask;
    }

    // Clear bit at given position (0-based)
    static int clearBit(int n, int pos) {
        int bitMask = ~(1 << pos);
        return n & bitMask;
    }

    // Update bit at given position (0-based) to value (0 or 1)
    static int updateBit(int n, int pos, int value) {
        // clear the bit first
        n = clearBit(n, pos);
        int bitMask = value << pos;
        return n | bitMask;
    }

    // Sorting 
    static void bubbleSort(){
        int [] arr = {4,3,2,7,1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void selectionSort(){
        int [] arr = {7,8,3,1,2};
        
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[smallest]>arr[j]) {
                   smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void insertionSort(){
        int [] arr = {6,5,1,2,4};

        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int j = i-1;
            while(j>=0 && curr < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
    }

    static int myGetBit(){
        int n = 5;
        int pos = 3;
        int bitMask = 1 << pos;
        return (bitMask & n) == 0 ? 0 : 1; 
    }

    static int mySetBit(){
        int n = 5;
        int pos = 3;
        int bitMask = 1 << pos;
        int newNum = bitMask | n;
        return newNum;
    }

    static int myClearBit(){
        int n = 5;
        int pos = 3;
        int bitMask = 1 << pos;
        int notBitMask = ~(bitMask);
        int newNum = n & notBitMask;
        return newNum;
    }

    static int updateBit(){
        // int n = 5;
        // int pos = 3;
        int value = 0;
        if(value == 0){
            return myClearBit(); // in this case it works
            // only because values are given same by me
            // manually; if we need for some other 
            // then send the values as parameters with 
            // the function
        } else {
            return mySetBit(); // same for this too
        }
    }

    static void myBubbleSort(){
        int arr [] = {6,7,1,3,2};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void mySelectionSort(){
        int arr [] = {7,9,1,4,6};

        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void myInsertionSort(){
        int arr [] = {3,2,5,1,8};

        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int j = i-1;
            while(j >= 0 && curr < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
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

        // diamondPattern(4);

        // System.out.println(sumOfOdd(3));

        // countNum();

        // calGcd(12,24);

        // fibonacci(8);

        // factorial(5);

        // findX();

        // setBit();

        /* 
        int n = 5; // binary 0101

        System.out.println("Original: " + n);

        System.out.println("Get bit (pos 0): " + getBit(n, 0)); // 1
        System.out.println("Get bit (pos 2): " + getBit(n, 2)); // 1

        System.out.println("Set bit (pos 1): " + setBit(n, 1)); // 7 (0111)
        System.out.println("Clear bit (pos 2): " + clearBit(n, 2)); // 1 (0001)

        System.out.println("Update bit (pos 1, value 0): " + updateBit(n, 1, 0)); // 5 -> 0101 -> 0101 (still 5)
        System.out.println("Update bit (pos 1, value 1): " + updateBit(n, 1, 1)); // 5 -> 0111 = 7
        
        */

        // myBubbleSort();

        // mySelectionSort();

        // myInsertionSort();
    }
}
