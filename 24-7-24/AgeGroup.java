import java.util.Scanner;

public class AgeGroup {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int age=sc.nextInt();
    if(age>=65){
        System.out.println("he is s a senior citizene mate ");
    }
    else if(age>=20){
        System.out.println("are and adult");
    }
    else if(age>=13){
        System.out.println("you are a  tenenager");
    }
    else{
        System.out.println("your a child ");
    }
    // if(age<13){
    //     System.out.println("Child");
    // }
    // else if(age<20){
    //     System.out.println("tene mate ");
    // }
    // else if(age<60){
    //     System.out.println("adult mate");
    // }
    // else{
    //     System.out.println("senior citizen mate");
    // }

}
}
