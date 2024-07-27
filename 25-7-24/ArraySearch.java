import java.util.Scanner;

public class ArraySearch {
public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,65,87,98};
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the target");
    int target=sc.nextInt();
  boolean ans=search(arr,target);
  if(ans==true){
    System.out.println("key is been found");
  }
  else{
    System.out.println("key is not found");
  }
String[] fef={"aviansh","monteiro","this si","me"};
System.out.println(fef.length);
System.out.println(fef[0]);

    
    }   
    public static boolean search(int[] arr,int target) 
    {
        int i=0;
        while(i<arr.length){
            if(arr[i]==target){
                return true;
            }
            i++;
        }
        return false;
    }
}
//everything is saw is the samw as theuy did it mate 