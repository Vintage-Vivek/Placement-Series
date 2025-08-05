import java.util.*;

public class Arrays {
    public static void main(String [] args) {
        // int [] marks = new int [3];
        // int [] marks = {97,98,99};

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] marks = new int[size];

        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 99;

        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++){
            System.out.print(marks[i]+" ");
        }

        for (int i = 0; i < marks.length; i++) {
            if(marks[i] == 3){
                System.out.println("\n"+i);
            }
        }

    }
}
