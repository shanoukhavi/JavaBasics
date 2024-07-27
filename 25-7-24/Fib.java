import java.util.Scanner;

public class Fib {
public static int fib(int n){
    if(n<=1) return n;
    int fibs=0;
    int i=2;
    int a=0,b=1;
    // int a=0;
    // int b=1;
    System.out.println("the series i"+0);
    System.out.println("the serises is like"+1);
    while(a+b<=n){//yes the last and first will tke u utto theST RANDO SHIT MATE 
        fibs=a+b;
        System.out.println("the series i"+fibs);
        a=b;
        b=fibs;
      
    }
    return fibs;

}
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
  System.out.println(fib(n));
}    
}
