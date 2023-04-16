public class arr24 {
    public static void main(String[] args) {
        //sum of two array
        int[][] num1={{1,2,3},{4,5,6}};
        int[][] num2={{1,2,3},{4,5,6}};

        int[][] num3=new int[2][3];
        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                num3[i][j]=num1[i][j]+num2[i][j];
                System.out.print(num3[i][j]+" ");
            }
            System.out.println();
        }
    }
}








/*
sum of two array
2 4 6
8 10 12
 */
