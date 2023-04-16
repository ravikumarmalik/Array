public class arr34 {
    public static void upperTriangular(int[][] arr) {
        System.out.println("upper triangular matrix:");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (i>j){
                    System.out.print("0"+" ");
                }else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {8, 6, 4}, {4, 5, 6}};
        upperTriangular(arr);
    }
}





/*

Upper triangular matrix:
1 2 3
0 6 4
0 0 6


 */
