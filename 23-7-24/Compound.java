import java.util.Scanner;

public class Compound {
    public static void main(String[] args) {
        //the details or as to be done to do it so 
        Scanner scanner = new Scanner(System.in);
        double p=scanner.nextDouble();
    double r=scanner.nextDouble();
        double t=scanner.nextDouble();
      //  double res=p*(1+r/100)^t;
      double res=p*Math.pow(1+r/100, t);
      //whatever is htereitll return as doublemate 
        System.out.println("the res is "+res);
    }
}
