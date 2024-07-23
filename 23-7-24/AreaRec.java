import java.util.Scanner;

public class AreaRec {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("wlecome to are acalculator");
        System.out.println("please enter the bas ein cms");
        double a=input.nextDouble();
        System.out.println("plea se enter th in cms");
        double b=input.nextDouble();
        double area=(a*b)/2;
        //oh for the double is bes t mate otherwise it is waste man 
    //     int  a=input.nextInt();
    // int  b=input.nextInt();
    //     float area=0.5f*(a*b);
    //this is s done mate 
        System.out.println("the area is"+area);
    }

}
