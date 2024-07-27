
import java.util.Scanner;

public class Deleete {
    public static int[] arrs(int arr[],int delet)
    {
        int i=0;
        int ct=0;
        while(i<arr.length){
        if(arr[i]==delet){
            ct++;
        }
        i++;
          
        }
        int[] newarr=new int[arr.length-ct];
        i=0;
        int j=0;
        while(i<arr.length)
        {
            if(arr[i]!=delet)
            {
                newarr[j]=arr[i];
                j++;
            }
            i++;
        }

return newarr;
        // i=0;
        // while(i<newarr.length)
        // {
        //     System.out.println(newarr[i]);
        //     i++;
        // }
//because see if u want to dellete the elelemnts not oposisibel mby takking the occurences how many  times it s reperating then array is created then u call the method from uutitility class which is the voi method been described he is  asying which is snot equal u go if it is eqwual just move the i mate othrewis iarr index ut of biudnf u will get 
    }
    public static void main(String[] args) {
        //thsi si sbebend odne to do it from so olong ttime mate 
        int[] arr=ArrayUtility.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.println("enter the element u want to delelte ");
        int  delete=input.nextInt();
     int[] deleteArray = arrs(arr,delete);
     //here it returbn ed the arrya ithen it is  apased isntot sipaly method and been shown mate 

ArrayUtility.displayArray(deleteArray);
    
        
        
    }
}
