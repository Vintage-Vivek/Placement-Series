package DSA;

class Sorting {

    static void printArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void bubbleSort(){
        // Bubble sort
        int [] bubble = {7,8,3,1,2};
        int size = bubble.length;

        for(int i = 0; i < size-1; i++){
            
            for (int j = 0; j < size-1-i; j++) {

                int curr = j;
                int next = j+1;

                if (bubble[curr] > bubble[next]) {
                    int x = bubble[curr];
                    bubble[curr] = bubble[next];
                    bubble[next] = x;
                }
            }
        }
        printArray(bubble);
    }

    static void selectionSort(){

        int [] arr = {7,8,3,1,2};
        int size = arr.length;

        // Selection sort
        for(int i = 0; i < size-1; i++){
            int smallest = i;
            for(int j = i+1; j < size; j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }

    static void insertionSort(){
        int [] arr = {7,8,3,1,2};

        for (int i = 0; i < arr.length-1; i++) {
            int sorted = i;
            for (int j = i+1; j < arr.length-1; j++) {
                int curr = i;
                int next = j;
                if(arr[curr] < arr[next]){
                    int temp = arr[next];
                    arr[sorted] = arr[curr];
                    arr[next] = temp; 
                } else if (arr[curr] > arr[next]){
                    sorted++;
                }
                
            }
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        // bubbleSort();
        // selectionSort();
        insertionSort();
    }
}
