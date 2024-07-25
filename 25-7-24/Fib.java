import java.util.Scanner;

public class Fib {
public static int fib(int n){
    if(n<=1) return n;
    int fibs=0;
    int i=2;
    int a=0,b=1;
    // int a=0;
    // int b=1;
    while(i!=n){
        fibs=a+b;
        a=b;
        b=fibs;
        i++;
    }
    return fibs;

}
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
  System.out.println(fib(n));
}    
}
