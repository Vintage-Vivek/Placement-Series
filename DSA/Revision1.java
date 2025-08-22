package DSA;

import java.util.ArrayList;
import java.util.HashSet;

class Revision1 {
    // recursion revision
    
    static void printNum(int n){
        if(n<=0) return;
        System.out.println(n);
        printNum(n-1);
    }

    static void printSum(int n, int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum += n;
        printSum(n-1,sum);
    }

    static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }

    static void fibonacci(int a, int b, int n){
        if(n==0){
            return;
        }
        System.out.print(a+" ");
        fibonacci(b, a+b, n-1);
    }

    static int xToPowN(int x, int n){
        if(n == 0 || x == 0) return 1;
        return x*xToPowN(x,n-1);
    }

    static int xToN(int x, int n){
        if (n == 0 || x == 0) {
            return 1;
        }
        int halfPower = xToN(x,n/2);
        if(n%2==0){
            return halfPower*halfPower;
        } else {
            return x*halfPower*halfPower;
        }
    }

    static void towerOfHanoi(int n, String src, String help, String des){
        if(n==1) {
            System.out.println("disk " + n + " from " + src + " to " + des);
            return;
        }
        towerOfHanoi(n-1,src,des,help);
        System.out.println("disk "+n+" from "+src+" to "+des);
        towerOfHanoi(n-1,help,src,des);
    }

    static void reverseString(String str, int i){
        if(i<0) return;
        System.out.print(str.charAt(i));
        reverseString(str, i-1);
    }

    static int first = -1, last = -1;

    static void findOccurance(String str, int i, char element){

        if(i > str.length()-1) {
            System.out.println(first+" and "+last);
            return;
        }
        
    
        char curr = str.charAt(i);
        if(curr == element) {
            if(first == -1){
                first = i;
            } else {
                last = i;
            }
        }
        findOccurance(str, i+1, element);
    }

    static boolean isSorted(int[]arr,int i){
        if(i == arr.length-1){
            return true;
        }
        int curr = arr[i];
        if(curr>arr[i+1]){
            return false;
        } else {
            return isSorted(arr,i+1);
        }

    }

    static void allxtoLast(String str, int i, int count, String newString){
        if (i==str.length()) {
            for (int j = 1; j <= count; j++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char curr = str.charAt(i);
        if(curr == 'x'){
            count++;
            allxtoLast(str, i+1, count, newString);
        } else {
            newString += curr;
            allxtoLast(str, i+1, count, newString);
        }
    }

    static void removeDuplicates(boolean [] alphabets,String str,int i, String newStr){

        if (i==str.length()) {
            System.out.println(newStr);
            return;
        }

        char curr = str.charAt(i);
        int mapIndex = curr - 'a';
        if(alphabets[mapIndex]==true) {
            i++;
            removeDuplicates(alphabets, str, i+1,newStr);
        } else {
            newStr += curr;
            alphabets[mapIndex] = true;
            removeDuplicates(alphabets, str, i+1, newStr);
        }
    }

    static void printSubsequences(String str, int i,String newStr){
        if(i == str.length()) {
            System.out.println(newStr);
            return;
        }

        char curr = str.charAt(i);
        // The following steps are to give choice 
        // If curr want to be in newStr
        printSubsequences(str, i+1, newStr+curr);
        // If curr does not want to get added
        printSubsequences(str, i+1, newStr);
    }

    static void printUnique(String str, int i, String newStr, HashSet <String> set){

        if(i==str.length()){
            if(set.contains(newStr)){
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }

        }

        char curr = str.charAt(i);
        // To be
        printUnique(str,i+1,newStr+curr,set);
        // Not to be
        printUnique(str,i+1,newStr,set);

    }

    static String [] keys = {".", "abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    static void printCombination(String str, int i, String combos){

        if (i==str.length()) {
            System.out.println(combos);
            return;
        }

        char curr = str.charAt(i);
        int keysIndex = curr-'0';
        String inKeys = keys[keysIndex];
        for (int j = 0; j < inKeys.length(); j++) {
            printCombination(str, i+1, combos+inKeys.charAt(j));
        }

    }

    // Advance 

    static void printPermutation(String str, String permutation){

        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for (int j = 0; j < str.length(); j++) {
            char curr = str.charAt(j);

            String newStr = str.substring(0,j) + str.substring(j+1);

            printPermutation(newStr, permutation+curr);
        }
    }

    static int calPaths(int i, int j, int n, int m){

        if(i == n || j == m) return 0;
        if(i == n-1 || j == m-1) return 1;

        // Right paths
        int rightPaths = calPaths(i, j+1, n, m);
        // Down paths
        int downPaths = calPaths(i+1, j, n, m);

        return rightPaths+downPaths;
    }

    static int placeTiles(int n, int m){

        if(n<m) return 1;
        if(n==m) return 2;

        // Placed vertically
        int plaVer = placeTiles(n-m,m);
        // Placed Horizontally
        int plaHor = placeTiles(n-1,m);
         
        return plaVer+plaHor;
    }

    static int callGuests(int n){

        if(n<=1) return 1;

        int single = callGuests(n-1);
        int pair = (n-1)*callGuests(n-2);

        return single+pair;
    }

    static void printSubsets(ArrayList<Integer>subsets){
        for (int i = 0; i < subsets.size(); i++) {
            System.out.print(subsets.get(i)+" ");
        }
        System.out.println();
    }
    
    static void findSubsets(int n, ArrayList<Integer>subsets){
        
        if(n==0){
            printSubsets(subsets);
            return;
        }

        // if number gets added
        subsets.add(n);
        findSubsets(n-1, subsets);
        // if number does not get added 
        subsets.remove(subsets.size()-1);
        findSubsets(n-1, subsets);
    }

    public static void main(String[] args) {

        ArrayList <Integer> subsets = new ArrayList<>();
        findSubsets(3,subsets);

        // int ways = callGuests(4);
        // System.out.println(ways);

        // int numberPlaced = placeTiles(4, 2);
        // System.out.println(numberPlaced);

        // printNum(5);

        // printSum(5,0);

        // System.out.println(factorial(5));

        // fibonacci(0,1,7);

        // System.out.println(xToPowN(2,3));

        // System.out.println(xToN(2,3));

        // towerOfHanoi(3,"src","help","des");

        // String str = "abcd";
        // int i = str.length()-1;
        // reverseString(str, i);

        // String str = "aabbcddddeggfaab";
        // int i = 0;
        // char element = 'b';
        // findOccurance(str, i, element);

        // int [] arr = {1,2,3,4,5,6};
        // int i = arr.length-1;
        // System.out.println(isSorted(arr,i));

        // String str = "axbxxcd";
        // allxtoLast(str, 0, 0, "");

        // boolean [] alphabets = new boolean[25];
        // String str = "abbccd";
        // removeDuplicates(alphabets, str, 0, "");

        // printSubsequences("abc",0,"");

        // String str = "aaa";
        // HashSet <String> set = new HashSet<>();
        // printUnique(str, 0, "", set);

        // printCombination("23",0,"");

        // printPermutation("abc", "");

        // int totalPaths = calPaths(0, 0, 3, 3);
        // System.out.println(totalPaths);


    }
}
