/*

print pairs of number using array.

*/

public class arr15 {
    public static void pairsOfNumber(int[] num) {
        int total=0;
        for (int i=0;i<num.length;i++){
            for (int j=i+1;j<num.length;j++){
                System.out.print("["+num[i]+","+num[j]+"]");
                total++;
            }
            System.out.println();
        }
        System.out.println("Total pairsOfNumber:"+total);
    }
    public static void main(String[] args) {
        int[] num={2,4,6,8,10};
        pairsOfNumber(num);
    }
}



/*

[2,4][2,6][2,8][2,10]
[4,6][4,8][4,10]
[6,8][6,10]
[8,10]

Total pairsOfNumber:10
 */



============================
    public class arr17 {
    public static void subArray(int[] num) {
        int total=0;
        for (int i=0;i<num.length;i++){
            int start=i;
            for (int j=i+1;j<=num.length;j++){
                int end=j;
                for (int k=start;k<end;k++){
                    System.out.print("["+num[k]+"]");
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subArray:"+total);
    }
    public static void main(String[] args) {
        int[] num={2,4,6,8,10};
        subArray(num);
    }
}



/*
{2}
{2}{4}
{2}{4}{6}
{2}{4}{6}{8}
{2}{4}{6}{8}{10}

{4}
{4}{6}
{4}{6}{8}
{4}{6}{8}{10}

{6}
{6}{8}
{6}{8}{10}

{8}
{8}{10}

{10}

total subArray:15
 */
