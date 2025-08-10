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

    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }
}
