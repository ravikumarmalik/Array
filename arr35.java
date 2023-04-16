public class arr35 {
    public static void main(String[] args) {
      int countOdd = 0, countEven = 0;
        int a[][] = {{4, 1, 3}, {3, 5, 7}, {8, 2, 6}};
        //Counts the number of even elements and odd elements
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                if(a[i][j] % 2 == 0)
                    countEven++;
                else
                    countOdd++;
            }
        }

        System.out.println("Frequency of odd numbers: " + countOdd);
        System.out.println("Frequency of even numbers: " + countEven);
    }
}

/*
Frequency of odd numbers: 5
Frequency of even numbers: 4
 */
