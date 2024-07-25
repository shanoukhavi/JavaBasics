import java.util.Scanner;
public class Mul {
   public static void main(String[] args)
   {
    //thsi is sthe way to do the codoing in the same way mt 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number ");
    int n=sc.nextInt();
 ans(n);
   } 
   public static void ans(int n){
   
    Scanner sc=new Scanner(System.in);
    int i=1;
    System.out.println("enter the range");
    int range=sc.nextInt();
    while(i<=range){

        System.out.println("the multiplication of the number "+n+"*"+i+" = "+(n*i));
        i++;
        //the value is thr same thing this is sito do th 
    }
   }
}
