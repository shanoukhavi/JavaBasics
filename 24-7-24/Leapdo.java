import java.util.Scanner;

public class Leapdo {
public static void main(String[] args) {
    //4 se multiplt y is the leeap year  mat e
    Scanner input=new Scanner(System.in);
    System.out.println("the numbers u put mate");
    int number=input.nextInt();
    // if( year%400==0){
    //     System.out.println("your year is  aleap year mate");
    // }
    // else if(year%100==0){
    //     System.out.println("the year is not a leap year mate");
    // }
    // else if(year%4==0){
    //     System.out.println("yout year is a leap yea r mate ");
    // }
    //yes done mate otheriws e u cant do ut otherwise it is ns waste t0 do i iy maye so this i s yhe wua yp do iy 

    if(number%4==0 && number%100!=0 ||( number%400==0)){
        //or is the trut e got mat e 
       //yes we did t it mat eotherwise it was not been try to pssosoible 
        System.out.println("then a leap year mate");
    }
    else{
        System.out.println("not a leap year mate ");
    }
}    
}
