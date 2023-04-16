public class arr32 {
    public static void main(String args[]) {
        //convert normal array to transpose array
        int original[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        int transpose[][] = new int[3][3];

        //transpose a matrix
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original.length; j++) {
                transpose[i][j] = original[j][i];
            }
        }

        //print original array
        System.out.println("Printing Matrix without transpose:");
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original.length; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }

        //print transpose array
        System.out.println("Printing Matrix After Transpose:");
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original.length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}






/*
Printing Matrix without transpose:
1 3 4
2 4 3
3 4 5
Printing Matrix After Transpose:
1 2 3
3 4 4
4 3 5
 */