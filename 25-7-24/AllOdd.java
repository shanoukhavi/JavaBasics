import java.util.Scanner;

public class AllOdd {
    public static int  ansFinal(int num){
        int i=1;
        int sum=0;
        while(i<=num){

            sum+=i;
            i+=2;
            //both the appraoches will be working ghere mate betwen tha tthing 
//             if(i%2!=0){
// sum+=i;
//             }
//             i++;
//         }
//         return sum;
    }
return sum;
}
    public static void main(String[] args) {
        //this sis the way odf adding it mate ot not so been caefufl tot do it 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       
        System.out.println("the sum of odd number s is"+(ansFinal(n)));
    }
}
