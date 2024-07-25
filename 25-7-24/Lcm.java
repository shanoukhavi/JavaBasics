import java.util.Scanner;

public class Lcm {
    public static int Lcm(int a,int b){
        int i=1;
        //bcsus ur hav to read the table so been writting it mate so bene carefult ot do it 

        while(true){
            //yes lees thna thingis done here 
            int factor=a*i;
            if(factor%b==0){
        return factor;
        //bbecaue see that it is 2%4--2 then 4%4---0 mate so been foin git 
            
            
            }
            i++;
                }
             //not required mat eeverytime itll be be true mate inifinit e true retutn se condn exit kar rahae hain
                //thhsis is is the unreachabe mate a been carefut o r do it 
    }
public static void main(String[] args) {
     //this is sithe appraoch where the compute rbene optimize to u mate 
 
     Scanner input=new Scanner(System.in);
     System.out.println("Enter the first number mate");
     int a=input.nextInt();
     System.out.println("enter the second number mate");
    int b=input.nextInt();
    System.out.println(Lcm(a,b));
    // int lcm=1;

   
    //the proces i een improovemnt mate 


    // int ans=a*b;
    // while(i<=ans){
    //     if(i%a==0 && i%b==0){
    //         //yes both e are the numbers as the zero cna be done ot samthign mate so been doin gfo r a long period of the time so bene doing it the sam time  waht is hte maximum limit ca be 15*20 everything is been psooible amte to do it 300 i sthe answer hea0in wo h bhai so been fojng it break or something here bhaiji
    //         lcm=i;
    //         break;
       
    //     }
    //     i++;
   
}
}
