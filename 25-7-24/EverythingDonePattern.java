import java.util.Scanner;

public class EverythingDonePattern {
public static void main(String[] args) {
     //this is sithe way to do it mate so i knwo how to code it mate in thsi way to do tu in the simple aways mate this is the best 
     Scanner sc=new Scanner(System.in);
     int rows=sc.nextInt();
     int i=0;
     while(i<rows){
        int j=0;
        while(j<rows-i-1){
            System.out.print(" ");
            j++;
        }
  
    int pattern=0;
    while(pattern<=i)
{
    System.out.print("*");
    pattern++;

}
System.out.println();
i++;


     }
    //  while(rows>0){
    //     System.out.print("*");
    //     int pattern=0;
    //     while(pattern<rows-1){
    //         System.out.print(" *");
    //         pattern++;
    //     }
    //     System.out.println();
    //     rows--;
    //  }

    ///****************************** */
    //  while(i<rows){
    //     System.out.print("*");
    //     int pattern=0;
    //     while(pattern<i){
    //         System.out.print(" *");
    //         pattern++;
    //     }
    //     System.out.println();
    //     i++;

    //  }
}    
}
