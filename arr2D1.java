public class arr2D1 {
    public static void print2dArr(int[][] num) {
        for (int i=0;i< 5;i++){
            for (int j=0;j<5;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] num={{1,2,3,4,5},{4,5,3,4,5}};
        print2dArr(num);
    }
}

/*
1 2 3 4 5
4 5 3 4 5
 */
