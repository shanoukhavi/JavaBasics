public class Sorted {
public static boolean isSortedIncrease(int[] arr){
   int i=1;
   while(i<arr.length){
if(arr[i]<arr[i-1]){
  return false;
}

    i++;
}
return true;

   }

   

public static boolean isSortedDecrease(int [] arr){
    int i=arr.length-2;
    while(i>=0){
if(arr[i]<arr[i+1]){
    return false;
}

        i--;
    }
    return true;
}
    public static void main(String[] args) {
        int[] myarr=ArrayUtility.inputArray();
        //cegxck the two methods incresasing decreading i fone of them is also true then array is in sorted orefer mate 
        boolean increasing=isSortedIncrease(myarr);
        boolean decreasing=isSortedDecrease(myarr);
        if(increasing|| decreasing){
            System.out.println("it is is sorted in order");
        }
        else{
            System.out.println("not sorted in any order");
        }
    }
}

