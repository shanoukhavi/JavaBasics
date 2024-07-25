import java.util.Scanner;

public class SumDigit {
public static void main(String[] args) {
    //this si sthe way to that thing mate //now thsi sis the way u do the coidn 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
  long sum=0;
  while(n!=0){
    //her eleiving it alone is ntot psooible 
    sum+=n%10;
    n/=10;
  }
  System.out.println(sum);
}    
}
