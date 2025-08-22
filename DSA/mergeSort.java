package DSA;

class mergeSort {

    // Function to divide the array
    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        // Recursively divide left and right parts
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);

        // Merge the sorted parts
        conquer(arr, si, mid, ei);
    }

    // Function to merge two sorted halves
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];

        int idx1 = si;     // starting index for left subarray
        int idx2 = mid + 1; // starting index for right subarray
        int x = 0;         // index for merged array

        // Merge both sorted parts into merged[]
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // If elements left in left subarray
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // If elements left in right subarray
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy merged array back to original array
        for (int i = 0; i < merged.length; i++) {
            arr[si + i] = merged[i];
        }
    }

    // Main function
    public static void main(String args[]) {
        int arr[] = {6, 3, 9, 5, 2, 8};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        divide(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

