public class Pallindrome {
    public static boolean checkPallindrome(int[] arr)
    {
        // int start=0;
        // int end=arr.length-1;
        int n=arr.length;
        int i=0;
        while(i<n/2) {
            if(arr[i]!=arr[n-i-1]){
                return false;
            }
        i++;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();
        boolean ans=checkPallindrome(arr);
        if(ans){
            System.out.println("the arary is sthe pallindrome");
        }
        else{
            System.out.println("not th paalindrome");
        }
    }
}
