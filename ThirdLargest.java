class Program{
    

    static void sortArray(int[] arr, int len){
    for(int i=0;i<len;i++){
        

        for (int j =i ;j<len; j++){

            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }
        }

      
      }
    }


    static void thirdSmallest(int [] arr1, int [] arr2, int len1, int len2){

        int num=0;

        sortArray(arr1, len1);

        // System.out.println(arr1);

        int count =0;

        for ( int i =0; i<len1;i++){
            boolean flag = true;

            for ( int j =0; j<len2;j++){
              if(arr1[i]==arr2[j]){
                flag = false;
                break;
              }
            }

            if(flag) count++;

            if(count==3) {
                num=arr1[i];
                System.out.println("num is "+num);
                break; 
            }
        }

        if(count==3){
            System.out.println("Third Smallest num: "+num);
           
        }
        else{
            System.out.println("Not Found");
        }
      
    }
    public static void main(String[] args) {
        
        //  int[] arr1 ={-1,2,-3,4,5,6};

        // int[] arr2 ={1,2,3};
        
        int[] arr1 ={5,10,3,0,-2,4,-2};

        int[] arr2 ={0,2,3,4,-2,5};

        int len1 = 7;
        int len2= 6;

        thirdSmallest(arr1,arr2,len1,len2);


    }
}