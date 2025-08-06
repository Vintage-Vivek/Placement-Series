class BitManipulation {
    public static void main(String [] args){
        int n = 5; //0101
        int pos = 2;
        int bitMask= 1<<pos;

        // Get Bit

        if((bitMask & n) == 0){
            System.out.println("Bit was 0");
        } else {
            System.out.println("Bit was 1");
        }

        // Set Bit
        int newNumber = bitMask | n;
        System.out.println(newNumber);

        // Clear bit
        int notBitMask = ~(bitMask);

        int clear = n & notBitMask;
        System.out.println(clear);

        // Update Bit
        int m = 5;
        int position = 1;
        int operation = 1; // update bit to 1;
        
        
    }
}
