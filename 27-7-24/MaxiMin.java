public class MaxiMin {
    public static int max(int[] arr){
        int maxi=arr[0];
        int i=1;
        //now if u wnt ot to return it ryt 
        if(arr.length==0) return Integer.MIN_VALUE;
        //yes th is is the appraicg can be use d mate Imtnerg eus the class which is s always maintained by java mate so other cant be written by it so othersise eu can do it  t0oo d o it mat e

        //yes in max u returrn Min_value mat e
        while(i<arr.length)
        {
            if(arr[i]>maxi){
                maxi=arr[i];
            }
            //yues if it is negative value we can t take it  everything it s there to be preffered mate so been sabse int_minn then then min to axi if they have -1 -1 -1 - ellement mate so  arrays elelement should be there mate 
            
            i++;
        }
      return maxi;
    }
    public static int min(int[] arr){
        int min=Integer.MAX_VALUE;
        int i=0;
        //yes u can go by the array eleemnt mate 
        while(i<arr.length){
            if(min>arr[i]){
                min=arr[i];
            }
            i++;
        }
        return min;

        // int i=0;
        // int mini=arr[0];
        // while(i<arr.length)
        // {
        //     if(arr[i]<mini){
        //         mini=arr[i];
        //     }
        //     i++;
        // }
        // return mini;
    }
    public static void main(String[] args) {
        //now see there are elements mate 1 2 3 4 ryt take a relement and go for the next here 
        int[] arr=ArrayUtility.inputArray();
     // the first teleemnt and take it 
        int maxi=max(arr);
        int mini=min(arr);
 
        System.out.println("the maximum elelemnt is"+maxi);
        System.out.println("the mijnimum elelemt is"+mini);

    }
}
