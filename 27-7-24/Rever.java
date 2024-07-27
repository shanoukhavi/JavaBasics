public class Rever {
    public static void reverseArray(int[] arr){
        // int start=0;
        // int end=arr.length-1;
        int i=0;
        int n=arr.length;
        while(i<arr.length/2){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
            // int temp=arr[start];
            // arr[start]=arr[end];
            // arr[end]=temp; everything is s psosible mate goated soln here iwhich is i been giveb tot od o it 
            // start++;
            // end--;
            i++;
            //heres see that u go by the half array and dod the ereverse of the it 6 3 u dod it  then  it is i 0 1 2 
        }
        // return arr; thsi si sinot requeired as ur retinging the samem earya ryt 
    }
    public static void main(String[] args) {
        //thsi si the where u try to reverse the arrya mate 
        int[] arr=ArrayUtility.inputArray();

        // int[] newRev=reverseArray(arr);
        System.out.println("The reversed array is: ");
        reverseArray(arr);
        ArrayUtility.displayArray(arr);
        //only array it axccepts aa the paramter not the other one mate been careful doing it 
        
    }
}
