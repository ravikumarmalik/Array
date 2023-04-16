public class arr14 {
    public static void reverseNumber(int[] num) {
        int fi=0;
        int li=num.length-1;
        while (fi<li){
            int temp=num[fi];
            num[fi]=num[li];
            num[li]=temp;
            fi++;
            li--;
        }
    }
    public static void printArray(int[] num) {
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6};
        reverseNumber(num);
        printArray(num);
    }
}
