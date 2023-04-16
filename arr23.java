import java.util.*;
public class arr23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][5];//jagged array
        System.out.println("enter your number...!!!");
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
               arr[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}




/*
enter your number...!!!
1 2 3 4 5 6 7 8 9 10 11 12 14 15 13
1 2 3 4 5
6 7 8 9 10
11 12 14 15 13

If we are creating odd number of columns in a 2D array,
it is known as a jagged array.
In other words, it is an array of arrays with different number of columns.
 */
