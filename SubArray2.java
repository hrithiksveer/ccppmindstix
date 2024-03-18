class Program{


    static void subArray(int[] arr, int k , int e){ 
       long temp_max_sum=0;
       int max_sum=Integer.MAX_VALUE;
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
                max_sum=(int)temp_max_sum;
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
         
        int [] arr = {Integer.MAX_VALUE,Integer.MIN_VALUE,0,7,50,40,90,0,0,Integer.MIN_VALUE};
        int k= 3;
        int e = 50;
        
        //Calling the SubArray 
        subArray(arr,k,e);

    }
}