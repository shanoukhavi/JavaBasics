
public class SumAvg {
public static void main(String[] args) {
    System.out.println("Welcome to array sum and avergae");
    int[] numArray=ArrayUtility.inputArray();
    long sum=sum(numArray);
    System.out.println("the sum is"+sum);
    double avg=avg(numArray);
    System.out.println("the avg of the numbers  is"+avg);
    //here it is the aray u can acces s it mate 
    //metid i i s claled u csn use the array 

    //everything usitaken by the array 
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Weecome to the aray sm and the average mate");
//     System.out.println("Please enter the number of the lelements");
//     int size=sc.nextInt();
//     int[] arr=new int[size];
//     //now here the array is sdeclared witht the size mate 
//     int i=0;
//     while(i<size) {
//         //or or the size i aslaos possible which is sbest appraoch to
//         System.out.println("enter the lelement number mate"+(i+1)+":");
//         arr[i]=sc.nextInt();
//         //at the ith position i try to uinsert itn mate otherwsie i dont go for hte next mate 
    
//         i++;
// }
// i=0;
// while(i<arr.length) {
//  System.out.println("the array lelements are the"+(arr[i]));
//  i++;   
// }
}
public static long sum(int[] arr){
    long sum=0;
    int i=0;
    while(i<arr.length){
        sum+=arr[i];
        i++;
    }
    return sum;
}
public static double avg(int[] arr){
    double ans=sum(arr);
 

    return ans/arr.length;
    //so return the int mate so been carefully dodin itt i before it was done to do it 
}
}
