package DSA;

import java.util.*;

class Recursion3 {

    static void printPermutation(String str, String permutation){

        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            // abc -> bc
            String newString = str.substring(0,i)+str.substring(i+1);
            // str.substring(0,i) -> "" and str.substring(i+1) -> "bc" then furthur iterations
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

    static int waysToPlaceTiles(int n, int m){

        if (n == m) return 2;

        if(n < m) return 1; 

        // If we put first Horizontally (__)
        int horizontalPlacement = waysToPlaceTiles(n-1, m);
        
        // If we put first vertical (|)
        int verticalPlacement = waysToPlaceTiles(n-m, m);

        return horizontalPlacement+verticalPlacement;
        
    }

    static int callGuests(int n){

        if(n<=1) return 1;

        // single
        int way1 = callGuests(n-1);

        // pair 
        int way2 = (n-1)*callGuests(n-2);

        return way1+way2;
    }

    static void printSubsets(ArrayList <Integer> subsets){
        System.out.print("( ");
        for (int i = 0; i < subsets.size(); i++) {
            System.out.print(subsets.get(i)+" ");
        }
        System.out.print(" )");
        System.out.println();
    }

    static void findSubsets(int n, ArrayList <Integer> subsets) {

        if(n==0) {
            printSubsets(subsets);
            return;
        }

        // "if the number will be added"
        subsets.add(n);
        findSubsets(n-1, subsets);

        // "if the number will not be added"
        subsets.remove(subsets.size()-1);
        findSubsets(n-1, subsets); 

    }

    public static void main(String[] args) {

        // String str = "abc";
        // printPermutation(str, "");

        // int n = 3, m = 3;
        // int totalPaths = countPaths(0, 0, n, m);
        // System.out.println(totalPaths);

        // int n = 6, m = 4;
        // System.out.println(waysToPlaceTiles(n, m));

        // int n = 4;
        // System.out.println(callGuests(n));

        int n = 3;
        ArrayList <Integer> subsets = new ArrayList<>(); 
        findSubsets(n, subsets);
        
    }
}
