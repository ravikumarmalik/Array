import java.util.*;
public class arr2D3 {
    public static boolean searchElement(int[][] arr,int key) {
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i][j]==key){
                    System.out.print("element found at index no:"+"("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[5][5];
        System.out.print("enter your element:");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        //output
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        searchElement(arr,5);
    }
}

/*
enter your element:1 2 3 4 5 6 7 8 9
1 2 3
4 5 6
7 8 9
element found at index no:(1,1)
 */
