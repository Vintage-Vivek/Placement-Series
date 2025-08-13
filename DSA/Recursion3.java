package DSA;

public class Recursion3 {

    static void printPermutation(String str, String permutation){

        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            // abc -> bc
            String newString = str.substring(0,i)+str.substring(i+1);
            printPermutation(newString, permutation+currChar);
        }
    }

    static int countPaths(int i, int j, int n, int m){

        if(i == n || j == m) return 0;
        if(i == n-1 && j == m-1) return 1;
        
        // Move Downwards
        int downPaths = countPaths(i+1, j, n, m);

        // Move right
        int rightPaths = countPaths(i,j+1,n,m);

        return downPaths+rightPaths;
    }

    public static void main(String[] args) {

        // String str = "abc";
        // printPermutation(str, "");

        int n = 3, m = 3;
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println(totalPaths);
    }
}
