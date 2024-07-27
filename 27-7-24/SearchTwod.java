import java.util.Scanner;

public class SearchTwod {
    public static boolean searchIt(int[][] arr,int target){
        int i=0;
   
        while(i<arr.length){
int j=0;
while(j<arr.length){
    if(arr[i][j]==target) {return true;}
j++;
}
i++;

        }
        return false;
    }
 public static void main(String[] args) {
    System.out.println("Welcome two search ");
    int[][] arr=ArrayUtility.input2DArray();
    Scanner input=new Scanner(System.in);
    System.out.println("enter the ellement u want to search for it ");
    int target=input.nextInt();
    boolean found=searchIt(arr,target);
    if(found){
        System.out.println("found the elelemnt");
    }
    else{
        System.out.println("not found the ellement");
    }
    //input the two dimeennsiona l array amamt e 
 }   
}
