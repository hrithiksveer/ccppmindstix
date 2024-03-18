class Program{


    static void subArray(int[] arr, int k , int e){ 
       int temp_max_sum=0;
       int max_sum=1100000;
       int pos=0;
       boolean flag;

       if(k>=arr.length-1){
       System.out.println("K is Max than Array Length");
       return;}

        for (int i=0; i<arr.length-k+1; i++){
            flag=true;
            for (int j =i ;j<i+k;j++){
                if(arr[j]==e )
                flag = false;
             temp_max_sum+=arr[j];
            }

             if (temp_max_sum<max_sum  && flag!=false){
                max_sum=temp_max_sum;
                pos=i;
             }

             temp_max_sum=0;
        
        }
        for(int i=pos;i<pos+k;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Sub Array Range is ");
        for(int i=pos;i<pos+k;i++){
            
            System.out.print(i+" ");
        }

    }

    
    public static void main(String[] args) {
         
        int [] arr = {20,10,3,7,50,40,90};
        int k= 3;
        int e = 10;

        

        subArray(arr,k,e);

    }
}