import java.util.*;
public class arr2D2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        System.out.print("enter your number:");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}









/*
enter your number:1 2 3 4 5 6 7 8 9
1 2 3
4 5 6
7 8 9

 */