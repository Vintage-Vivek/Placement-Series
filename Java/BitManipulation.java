import java.util.Scanner;

class BitManipulation {
    public static void main(String [] args){
        // int n = 5; //0101
        // int pos = 2;
        // int bitMask= 1<<pos;

        // // Get Bit

        // if((bitMask & n) == 0){
        //     System.out.println("Bit was 0");
        // } else {
        //     System.out.println("Bit was 1");
        // }

        // // Set Bit
        // int newNumber = bitMask | n;
        // System.out.println(newNumber);

        // // Clear bit
        // int notBitMask = ~(bitMask);

        // int clear = n & notBitMask;
        // System.out.println(clear);

        // Update Bit
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt(); 
        // oper=1 : set, oper=0 : clear
        
        int n = 5;   // 0101
        int pos = 1;

        int bitMask = 1 << pos;
        if (oper == 1) {
            // set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
