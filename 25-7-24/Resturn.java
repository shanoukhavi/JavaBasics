import java.util.Scanner;

public class Resturn {
public static int add(int a,int b)
{
    //thsi is sthe parameter mate 
    int an=a;
    int ba=b;
    return an+ba;
}
public static int read(){
    Scanner s=new Scanner(System.in);
    int number=s.nextInt();
    return number;
}
    public static void main(String[] args)
{
    //when u retub4 ft9i mate then the fn will be edend ther eonly otherwsie itll be big haectic for a person to oslve it 
//strings are bben taken mat eher eit i s given tto do it 
//println is the fn sacanener clas is laos scanner class everhtting is  done amte to do it 
    System.out.println("Welcome to the calculator");
    System.out.println("Please enter the number mate");
    int first=read();
    System.out.println("pleadse neter tge another number");
    int second=read();
    // int result=add(first,second);
    System.out.println(add(first,second));
    //print ln is the fn mate her e it is givne or not been careful to do kit mate os been doing it from long time mate 
    //this is sthe argument mate 

}    
}
