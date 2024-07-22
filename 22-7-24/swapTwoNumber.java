import java.util.Scanner;

public class swapTwoNumber {
public static void main(String[] args) {
    //now see u want to swap two numbers mate been careful to it 
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    System.out.println("the numbers before the swaps are "+a+" "+b);
    int temp=a;
    a=b;
    b=temp;
    System.out.println("the numbers after swap is "+a+" "+b);
}    
}
