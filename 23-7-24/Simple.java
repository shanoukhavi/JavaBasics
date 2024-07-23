import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        //bow to calcualte the simple intrest it i isi like 
        Scanner sc=new Scanner(System.in);
double p=sc.nextDouble();
double r=sc.nextDouble();
double t=sc.nextDouble();
double si=(p*r*t)/100;
      
        System.out.println("the simple interest is"+si);
    }
}
