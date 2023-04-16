public class arr29 {
    public static void main(String[] args) {
        //find the duplicate number in the given array.
        int[] arr={1,2,3,4,4,5,6,5,6};
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    System.out.println("duplicate number:"+arr[i]+" ");
                }
            }
        }
    }
}










/*
duplicate number:1
duplicate number:2
duplicate number:3
duplicate number:4
duplicate number:5
duplicate number:6

 */
