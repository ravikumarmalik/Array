import java.util.*;
public class arr2 {
    public static void main(String[] args) {
        //input from users
        Scanner sc=new Scanner(System.in);
        int[] marks=new int[4];
        System.out.print("enter your physics marks:");
        marks[0]=sc.nextInt();

        System.out.print("enter your chemistry marks:");
        marks[1]=sc.nextInt();

        System.out.print("enter your math marks:");
        marks[2]=sc.nextInt();

        System.out.print("enter your english marks:");
        marks[3]=sc.nextInt();

        for (int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
    }
}














/*
enter your physics marks:97
enter your chemistry marks:98
enter your math marks:73
enter your english marks:69
97 98 73 69 0

 */
