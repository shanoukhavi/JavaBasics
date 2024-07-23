import java.util.Scanner;

public class Perim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        double d=scanner.nextDouble();
       
        System.out.println("the perimeter of the rectangle is "+(a+b+c+d));
    }
}
