import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to ticket discount calculator");
        System.out.println("Please enter your age mate");
        int age=sc.nextInt();
        System.out.println("Are you  female");
        boolean isFemale=sc.nextBoolean();
        if(age<5 )
        {
            System.out.println("you got the 75% discount mate");
        }
        else if(isFemale){
            System.out.println("you got the 50% discount");
        }
        else if(age>60  && !isFemale) {
    System.out.println("you got 25% discount");
        }
        else{
            System.out.println("you got the no discount mate ");
        }
}
}
// stopped ate 555 