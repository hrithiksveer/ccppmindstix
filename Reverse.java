public class Reverse {

    public static String reverseAlphabets(char[] arr, int arr_len) {
        int left = 0;
        int right = arr_len - 1;
        
        while (left < right) 
        
        {
            if (!((arr[left] >= 'a' && arr[left] <= 'z') || (arr[left] >= 'A' && arr[left] <= 'Z'))) {
                left++;
            } else if (!((arr[right] >= 'a' && arr[right] <= 'z') || (arr[right] >= 'A' && arr[right] <= 'Z'))) {
                right--;
            } else {
                // Swap only if both characters are alphabets
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(arr);
    }
    public static void main(String[] args) {
        
        //Data For Testing Testing
        char[] arr1 = {'a', 'b', '$', 'c', 'd', '#'};
        char[] arr2 = {'A', 'b', 'c', '#', 'd', '&'};

        //Calling Function For Testing 
        System.out.println("Input 1: " + arr1.toString());
        System.out.println("Output 1: " + reverseAlphabets(arr1,arr1.length));
        
        System.out.println("Input 2: " + arr2.toString());
        System.out.println("Output 2: " + reverseAlphabets(arr2,arr2.length));
    }
    
    
}
