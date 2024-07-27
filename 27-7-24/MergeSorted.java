public class MergeSorted {
    public static void main(String[] args) {
        //increasing orde rmate they are  mergee the sorted array mate here we try to add the ellements in the eorfere twon ppointer approach mate idhar its then done to d o it 
        //everything is chota hai bhaiya to do dtu ttotherwise it is is not been pososible tot fo di t mate s o been doing of r h leong perood o f the yie 
        System.out.println("Welcome to merging sorted attaays\n");
        int[]arr1=ArrayUtility.inputArray();
        int[]arr2=ArrayUtility.inputArray();
        int[]merged=merge(arr1,arr2);
        System.out.println("your merged array is");
   ArrayUtility.displayArray(merged);
    }
    public static int[] merge(int[] arr1,int[] arr2){
int newSize=arr1.length+arr2.length;
int[] merged=new int[newSize];
//k i s where it is there mate 
int i=0,j=0,k=0;
while(i<arr1.length ||  j<arr2.length) {
    //if one is ther u be thee ot totherwise come and skoip fromt he arrat and go it mat 
//bothe u hva eot run 
if(j==arr2.length || ( i<arr1.length&& arr1[i]<arr2[j])){
    //iif the j i si emptued mate so been owkrkingn here otherwise go for thzt condn  or ro ro mate 
    //tht means the seocnd is omepty mate 
    merged[k]=arr1[i];

    i++;

}
else{
merged[k]=arr2[j];
j++;
}
k++;

}
//again the loop will be there if anyone will be ther 
// while(i<arr1.length){
//     merged[k]=arr1[i];
//     i++;
//     k++;
// }
// while(j<arr2.length){
// merged[k]=arr2[j];
// j++;
// k++;
// }
return merged;

}
}
