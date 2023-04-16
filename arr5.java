public class arr5 {
    public static void update(int[] marks) {//update function
        for (int i=0;i<marks.length;i++){
           marks[i]=marks[i]+1;//update your marks with 1
        }
    }
    public static void printArr(int[] marks) {//printArr function
        for (int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] marks = {90, 98, 97, 87,89,9};
        update(marks);//update function call
        printArr(marks);//printArr function call
    }
}
