import java.util.Scanner;

public class Calc {
public static void main(String[] args) {
    //everyhing is possible mate 
    int a,b;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    int c=a+b;
    System.out.println("the addn is "+c);
    c=a-b;
    System.out.println("the subtraction is "+c);
    c=a*b;
    System.out.println("the multiplication is "+c);
    c=a/b;
    System.out.println("the division is "+c);
    c=a%b;
    System.out.println("the modulus is "+c);
}    
}
