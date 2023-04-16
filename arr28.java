public class arr28 {
    public static void main(String[] args) {
        int[] arr1 ={1, 2, 3, 4, 5};
        int[] arr2=new int[5];

        //Copying all elements of one array into another
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        //print arr1
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        //print arr2
        System.out.println("Elements of new array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}



/*
Elements of original array:
1 2 3 4 5
Elements of new array:
1 2 3 4 5

 */
