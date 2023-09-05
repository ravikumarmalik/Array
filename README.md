# Array
Array is the collection of same data type.
Array stores a fixed-size sequential collection of elements of the same type.
And array starting from '0' index.

# Properties of array
1. Each element in an array is of the same data type and carries the same size that is 4 bytes.
2. Elements in the array are stored at contiguous memory locations from which the first element is stored at the smallest memory location.
3. Elements of the array can be randomly accessed since we can calculate the address of each element of the array with the given base address and the size of the data element.

# Why are arrays required?
	# Arrays are useful because -
	1.Sorting and searching a value in an array is easier.
	2.Arrays are best to process multiple values quickly and easily.
	3. Arrays are good for storing multiple values in a single variable
	
	
# Memory allocation of an array

As stated above, all the data elements of an array are stored at contiguous locations in the main memory. 
The name of the array represents the base address or the address of the first element in the main memory. 
Each element of the array is represented by proper indexing.

We can define the indexing of an array in the below ways -
1. 0 (zero-based indexing): The first element of the array will be arr[0].
2. 1 (one-based indexing): The first element of the array will be arr[1].
3. n (n - based indexing): The first element of the array can reside at any random index number.

# Basic operations
1. Traversal - This operation is used to print the elements of the array.
2. Insertion - It is used to add an element at a particular index.
3. Deletion - It is used to delete an element from a particular index.
4. Search - It is used to search an element using the given index or by the value.
5. Update - It updates an element at a particular index.

# Time Complexity
Operation		Average Case		Worst Case
Access	O(1)		O(1)
Search	O(n)		O(n)
Insertion		O(n)			O(n)
Deletion		O(n)			O(n)

# Space Complexity
In array, space complexity for worst case is O(n).



syntax:-
	dataType[] arrayName;
	
# Creating Arrays
You can create an array by using the new operator with the following syntax −

	dataType[] arrayName = new dataType[arraySize];
	
	Alternatively
	
	dataType[] arrayName = {value0, value1, ..., valuek};
	
The array elements are accessed through the index. Array indices are 0-based,that is, they start from 0 to arrayName.length-1.
ex-
	int[] marks = new int[10];
	
	1. Index starts with 0.
	2. The array's length is 10, which means we can store 10 elements.
	3. Each element in the array can be accessed via its index.
	
# Processing Arrays
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

# Advantages of Array

1. Array provides the single name for the group of variables of the same type. Therefore, it is easy to remember the name of all the elements of an array.
2. Traversing an array is a very simple process; we just need to increment the base address of the array in order to visit each element one by one.
3. Any element in the array can be directly accessed by using the index.

# Disadvantages of Array
1. Array is homogenous. It means that the elements with similar data type can be stored in it.
2. In array, there is static memory allocation that is size of an array cannot be altered.
3. There will be wastage of memory if we store less number of elements than the declared size.


# 2D Array
2D Array is a array of array.
2D arrays are created to implement a relational database look alike data structure. It provides ease of holding bulk of data at once which can be passed to any number of functions wherever required.

# How to declare 2D Array
The syntax of declaring two dimensional array is very much similar to that of a one dimensional array, given as follows.

int arr[max_rows][max_columns];   


for ( int i=0; i<n ;i++)  
{
for (int j=0; j<n; j++)   
    {
        a[i][j] = 0;  
    }   
}  







