public class SumAvgTwo {
    public static void main(String[] args) {
        int[][] arr=ArrayUtility.input2DArray();
        long ans=sums(arr);
        System.out.println("the sum is"+ans);
        double avg=avgs(arr);
        System.out.println("the avg is"+avg);
        
    }
    public static long sums(int[][] arr){
        int sum=0;
        int i=0;
        while(i<arr.length){
int j=0;
while(j<arr[i].length){
    sum+=arr[i][j];
    j++;
}
i++;
        }
        return sum;
    }
    public static double avgs(int[][] arr){
        long sum=sums(arr);
        return sum/(arr.length+arr[0].length);
    }
}
