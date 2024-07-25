import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the umber mate");
    int n=sc.nextInt();
    int rev=0;
    while(n!=0){
        rev=rev*10+n%10;
        n=n/10;
    }
    System.out.println("the rev is"+rev);
    //eveertyhtin gis much psooibe mate rather than the before or the afte rnumbers befor eur thig mat e

}    
}
