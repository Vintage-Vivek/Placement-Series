package DSA; 

import java.util.HashSet;

class Recursion2 {
    
    static void towerOfHanoi(int n,String src, String help, String des){
        if(n==1){
            System.out.println("Disk " + n + " from " + src +" to " + des);
            return;
        }
        towerOfHanoi(n-1, src, des, help);
        System.out.println("Disk " + n + " from " + src +" to " + des);
        towerOfHanoi(n-1, help, src, des);
    }

    static void reverseString(int idx, String str){
        if(idx<=0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverseString(idx-1, str);
    }

    static int first = -1;
    static int last = -1;

    static void findOccurance (String str, int idx, char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccurance(str, idx+1, element);
    }
    
    static boolean isSorted(int [] arr, int idx){
        if(idx == arr.length-1){
            return true;
        }
        // To the point logic
        // if(arr[idx] < arr[idx+1]){
        //     return isSorted(arr,idx+1);
        // } else {
        //     return false;
        // }
        // Reversed logic
        if(arr[idx] >= arr[idx+1]){
            return false;
        } else {
            return isSorted(arr, idx+1);
        }
    }
    
    static void moveAllX(String str, int idx, int count, String newString){
        if(idx == str.length()){
            for(int i = 0; i < count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            count++;
            moveAllX(str, idx+1, count, newString);
        } else {
            newString += currChar;
            moveAllX(str, idx+1, count, newString);
        }
    }

    static boolean [] map = new boolean[26];

    static void removeDuplicates(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            removeDuplicates(str, idx+1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newString);
        }
    }

    static void printSubsequence(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        // To be in new string
        printSubsequence(str, idx+1, newString+currChar);

        // Not to be 
        printSubsequence(str, idx+1, newString);

    }

    static void uniqueSubsequence(String str, int idx, String newString, HashSet<String> set){

        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            } else {
                set.add(newString);
                System.out.println(newString);
                return;
            }
        }

        char currChar = str.charAt(idx);
        // To be
        uniqueSubsequence(str, idx+1, newString+currChar, set);
        // Not to be
        uniqueSubsequence(str, idx+1, newString, set);

    }

    static String [] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};

    static void printCombo(String str, int idx, String combination){

        if(idx == str.length()){
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for(int i = 0; i < mapping.length(); i++){
            printCombo(str, idx+1, combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        // int n = 3;
        // towerOfHanoi(n, "S", "H", "D");

        // String str = "abcd";
        // int idx = str.length()-1;
        // reverseString(idx, str);

        // findOccurance("baacdaefaaha", 0, 'a');

        // int [] arr = {1,2,3,4,5};
        // System.out.println(isSorted(arr, 0));

        // String str = "axbcxxd";
        // moveAllX(str, 0, 0, "");

        // String str = "abbccda";
        // removeDuplicates(str, 0, "");

        // String str = "abc";
        // printSubsequence(str, 0, "");

        // String str = "aaa";
        // HashSet <String> set = new HashSet<>();
        // uniqueSubsequence(str, 0, "", set);
        
        printCombo("23",0,"");
    }
}
