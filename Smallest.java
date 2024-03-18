 public class Smallest {

    
    public static int smallestNotPresent(int[] arr1, int[] arr2 , int arr1_len, int arr2_len) {
       
        int min = Integer.MAX_VALUE;
        boolean found = false;

        for (int i = 0; i < arr1_len; i++) {
            boolean present = false;
            for (int j = 0; j < arr2_len; j++) {
                if (arr1[i] == arr2[j]) {
                    present = true;
                    break;
                }
            }
            if (!present && arr1[i] < min) {
                min = arr1[i];
                found = true;
            }
        }

        return found ? min : Integer.MIN_VALUE;
    }
    public static void main(String[] args) {
        int[] arr1_1 = {11, 15, 9, 2, 7, 22};
        int[] arr2_1 = {9, 7, 11, 2};
        System.out.println("Sample input 1:");
        System.out.println("Output: " + smallestNotPresent(arr1_1, arr2_1,arr1_1.length,arr2_1.length));

        int[] arr1_2 = {1, 11, 22, 0, 32, -3, 8};
        int[] arr2_2 = {9, 32, 1, 22};
        System.out.println("\nSample input 2:");
        System.out.println("Output: " + smallestNotPresent(arr1_2, arr2_2,arr1_1.length,arr2_1.length));
    }


    
}
