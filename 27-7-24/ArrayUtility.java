import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Please enter element no " + (i+1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
    public static void displayArray(int[] numArray)
    {
        int i=0;
        while(i<numArray.length)
        {
            System.out.println("the ellements are"+numArray[i]);
            i++;
        }
    }
    public static int[][] input2DArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enete rthe number of rows and colummns mate");
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] newArray=new int[rows][cols];
        //size is i declared as sizea ss rosw and cols
        int i=0;
       
        while(i<rows){
            //or the arr.length 
int j=0;
while(j<cols){
    //the arr[i].length can be input beothe ae th e one and the same 
System.out.println("please eneter the ellement u want to enter row "+(i+1)+"column"+(j+1+":"));
newArray[i][j]=sc.nextInt();
j++;

}
i++;
        }
        return newArray;
    }
}
//this si helps to return the arrray u eee dot ogive it 