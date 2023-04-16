public class arr33 {
    public static void lowerTriangle(int[][] arr) {
        System.out.println("lower triangular matrix:");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j< arr.length;j++){
                if (i<j){
                    System.out.print("0"+" ");
                }else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{1,2,3}};
        lowerTriangle(arr);
    }
}



/*
lowerTriangle matrix:
1 0 0
4 5 0
1 2 3

 */
