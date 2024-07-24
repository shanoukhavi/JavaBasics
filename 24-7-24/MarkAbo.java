import java.util.Scanner;

public class MarkAbo {
public static void main(String[] args) {
    //ths is is the besst waty to do it mate 
    Scanner input=new Scanner(System.in);
    System.out.println("enter the percentage mate");
    float per=input.nextFloat();
   if(per>=90){
    System.out.println("yiou have got a mate");
   }
   else if(per>=75 )
{
    System.out.println("b grade");
}
else if(per>=60 ){
    System.out.println("c grade");
}
else if(per>=30 )
{
    System.out.println("d grade mate");
}
//yes d dis the answr mate 
else{
    System.out.println("f grade mate");
}
}    
}
