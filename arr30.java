public class arr30 {
    public static void main(String[] args) {
        //find the even number in given array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 1; i < arr.length; i = i + 2) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
even number
2 4 6 8 10
 */
