
import java.util.Scanner;

public class NumbOccurence {
    public static void main(String[] args) {
        int[] arr=ArrayUtility.inputArray();
        Scanner sc=new Scanner(System.in);
        System.out.println("Add the target tot the array to find with the occurences for it ");
        int target=sc.nextInt();
        int ans=count(arr,target);
        System.out.println("the count is"+ans);

    }
    public static int count(int[] arr,int target){
    
        int ct=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                ct++;
            }
        }
        return ct;
//         while(i<arr.length){
// if(arr[i]==target){
//     ct++;
// }
// i++;
//         }
//         return ct;
    }
}
