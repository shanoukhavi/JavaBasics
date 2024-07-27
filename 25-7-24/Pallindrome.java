import java.util.Scanner;

public class Pallindrome {
public static void main(String[] args) {
    //thsi siis the wat se tart it or none starts it mat e
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int ans=0;
    int org=num;
    while(num!=0){
        ans=ans*10+num%10;
        num/=10;
    }
    if(ans==org){
        System.out.println("its true pallindrome mate");
    }
    else{
        System.out.println("its not a pallindrome mate");
    }
}    
}
