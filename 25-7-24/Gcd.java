import java.util.Scanner;

public class Gcd {
//the divisior hwich wants the bigger number mate 
//one see sba fdivisor hosakta hai bhaiji 
public static void main(String[] args) {
    //the gcd is biggest number mate 
    Scanner input=new Scanner(System.in);
    System.out.println("ENter the first number");
    int first=input.nextInt();
    System.out.println("ente r the second number");
    int second=input.nextInt();
    int gcdValue=gcd(first,second);
    System.out.println("the gcd of the two number is"+gcdValue);

}
public static int gcd(int a,int b){
    int gcd=1;
    int i=2;
    int least=least(a,b);
    while(i<=least){
        if(a%i==0 && b%i==0){
            gcd=i;
            //thsis i the gretest comkon dividor 
        }
        i++;
    }

    return gcd;
}
//now do it of the min fn mate 
public static int least(int a,int b)
{
    if(a<b) return a;
    return b;
}
}
