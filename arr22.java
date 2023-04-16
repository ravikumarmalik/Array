public class arr22 {
    public static boolean appearsTwice(int[] num) {
        for (int i=0;i<num.length;i++){
            for (int j=i+1;j<num.length;j++) {
                if (num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] num={1, 1,3, 3, 4, 3, 2, 4, 2};
        //Twice:-same values are repeat multiple times in single array then return true otherwise false.
        System.out.println(appearsTwice(num));//true
    }
}
