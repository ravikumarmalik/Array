public class arr9 {
    public static int smallestNumber(int[] num) {
       // int smallest=Integer.MAX_VALUE;//+INFINITY
        int smallest=num[0];
        for (int i=0;i<num.length;i++){
            if (smallest>num[i]){
                smallest=num[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[] num={2,3,4,5,6,1,7,8,9};
        System.out.println(smallestNumber(num));

    }
}
