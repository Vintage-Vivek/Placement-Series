package DSA;

public class BackTracking {

    static void printPermutation(String str, String permutations){

        if(str.length()==0){
            System.out.println(permutations);
            return;
        }

        for (int j = 0; j < str.length(); j++) {
            
            char curr = str.charAt(j);
            String newStr = str.substring(0,j) + str.substring(j+1);

            printPermutation(newStr, permutations+curr);

        }

    }

    public static void main(String[] args) {
        
        printPermutation("abc", "");
    }
}

// Revision Day

