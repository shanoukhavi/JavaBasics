import java.util.Scanner;

public class Factorial {
public static long  factorial(int n){
    if(n<=1) return 1;  
 long fact=1;
 //this sfact orial is posisble by kaing it tlong mate otherwise not posisibelee ate           
    int i=2;
    while(i<=n){
        // fact=fact*i;
        fact*=i;
        i++;
    }
    //eevrything with initiialization i sposisble mate otherwise not psoosiible nmate lqwayas been using itt as long amte not than the other            
return fact;
}
    public static void main(String[] args) {
    //the factorial of the two numberes is 
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
 long ans=factorial(n);
 System.out.println("the factorial of the number is"+ans);
 //the return tp hat u  return is the same u written it mate otherwise u dont try to f me 

}    
}
