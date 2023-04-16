public class arr19 {
    public static void maxSumOfSubArray(int[] num) {
        int currentSum=0;
        //int maxSum=Integer.MIN_VALUE;
        int maxSum=num[0];
        for (int i=0;i<num.length;i++){
            int start=i;
            for (int j=i+1;j<=num.length;j++){
                int end=j;
                currentSum=0;
                for (int k=start;k<end;k++){
                    currentSum=currentSum+num[k];
                }
                System.out.println(currentSum);
                if (maxSum<currentSum){
                    maxSum=currentSum;
                }
            }
        }
        System.out.println("max sum ="+maxSum);
    }
    public static void main(String[] args) {
        int[] num={2,4,6};
        maxSumOfSubArray(num);
    }
}









/*
2
6
12
4
10
6
max sum =12
 */
