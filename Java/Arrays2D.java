import java.util.*;

class Arrays2D {
    public static void main(String [] args){
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int [][] nums = new int [rows][cols];
        
        System.out.println();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                nums[i][j] = sc.nextInt(); 
            }
        }

        System.out.println();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        int find = sc.nextInt();

        System.out.println();

        // Linear search
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(nums[i][j] == find){
                    System.out.println("at "+i+","+j);
                }
            }
        }
        
    }
}
