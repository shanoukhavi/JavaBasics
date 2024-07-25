import java.util.Scanner;

public class Prime {
//if a number is divided by 1 and number itself is calleda s the prime mate 
public static int isPrime(int number){
    int ct=0;
  int i=1;
  while(i<=number){
    if(number%i==0){
        ct++;
    }
    i++;
  }
  return ct;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
  int count=isPrime(n);
  if(count==2){
    System.out.println("yes it sprime number");
  }
  else{
    System.out.println("not a prime number mate ");
  }
    //create a program to check whetrher the number is prime or not mate 
    //2 3 4 only th two factors if thy hagve amte then it doesnt have if tt
}    
}
