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























/*

false
1 2 3

 */
