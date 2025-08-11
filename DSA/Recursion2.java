package DSA; 

public class Recursion2 {
    
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

    public static void main(String[] args) {
        // int n = 3;
        // towerOfHanoi(n, "S", "H", "D");
        // String str = "abcd";
        // int idx = str.length()-1;
        // reverseString(idx, str);
        findOccurance("baacdaefaaha", 0, 'a');
    }
}
