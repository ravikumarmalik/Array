public class arr1 {
    public static void main(String[] args) {
        /*
        total space 5 will be creating in memory
        and initially by-default occupies null value like (0 0 0 0 0)
         */
        int[] marks=new int[5];
        marks[0]=90;
        marks[1]=99;
        marks[2]=97;
        marks[2]=97+2;
        for (int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");     //90 99 99 0 0
        }
    }
}


========================================================

    public class arr11 {
    //clone array
    public static void main(String[] args) {
        int[] num={1,2,3};
        int[] cloneNum = num.clone();
        // will print false as deep copy is created
        System.out.println(num == cloneNum);
        for (int i = 0; i < cloneNum.length; i++) {
            System.out.print(cloneNum[i] + " ");
        }
    }
}






