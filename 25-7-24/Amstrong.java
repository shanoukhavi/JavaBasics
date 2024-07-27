import java.util.Scanner;

public class Amstrong {
    public static int count(int n){
        int ct=0;
        while(n!=0){
            ct++;
            n/=10;
        }
        return ct;
    }
    public static boolean isAmstrong(int  n)
    {
        int ansOr=n;
        int c=count(n);
        int ans=0;
        while(n!=0){
            int digit=n%10;
            ans+=Math.pow(digit,c);
            n/=10;
        }
        if(ansOr==ans) return true;
        return false;
       
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    if(isAmstrong(number)){
        System.out.println("Its is the amstrong number mate");
    }
    else{
        System.out.println("not a amstrong number mate");
    }
    
}    
}
