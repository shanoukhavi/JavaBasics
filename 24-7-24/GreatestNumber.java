import java.util.Scanner;

public class GreatestNumber {
public static void main(String[] args) {
    //ths is ithe wa yot do codee 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the 3 numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a>=b && a>=c){
        //sghor t circuit mate if one is trye then only u will ge t itheriwse u wong get it at e
        System.out.println("a is greater mate");
    }
    else if(b>=c){
        System.out.println("b i s greater mate");
    }
    else{
        System.out.println("c is sgreater mate ");
    }
}    
}
