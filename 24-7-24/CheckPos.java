import java.util.Scanner;

public class CheckPos {
public static void main(String[] args) {
    System.out.println("Enter the numbers mate");
    Scanner sc=new Scanner(System.in); 
    int number=sc.nextInt();
    if(number>0){
        System.out.println("its a positive number");
    }
    else if(number<0){
        System.out.println("its a negative number");
    }
    else{
        System.out.println("its a zero number");
    }
}    
}
