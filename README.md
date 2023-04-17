# Array
Array is the collection of same same data type.
Array stores a fixed-size sequential collection of elements of the same type.
And array starting from '0' index.

syntax:-
	dataType[] arrayName;
	
Creating Arrays
You can create an array by using the new operator with the following syntax −

	dataType[] arrayName = new dataType[arraySize];
	
	Alternatively
	
	dataType[] arrayName = {value0, value1, ..., valuek};
	
The array elements are accessed through the index. Array indices are 0-based,that is, they start from 0 to arrayName.length-1.
ex-
	int[] marks = new int[10];
	
Processing Arrays
When processing array elements, we often use either for loop or foreach loop because all of the elements in an array are of the same type and the size of the array is known.

The foreach Loops
JDK 1.5 introduced a new for loop known as foreach loop or enhanced for loop, which enables you to traverse the complete array sequentially without using an index variable.


public class arr {
   public static void main(String[] args) {
      int[] marks = {90,98,94,96};

      // Print all the array elements
      for (int element: marks) {
         System.out.println(element);
      }
   }
}


Passing Arrays to Methods
Just as you can pass primitive type values to methods, you can also pass arrays to methods. For example, the following method displays the elements in an int array −


public static void printArray(int[] array) {
   for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
   }
}






