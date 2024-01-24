# Difference-Array-ArrayLists

What is Array?

An array is a collection of the same type of elements that are grouped together and referred to by a common name. These elements are homogeneous in nature meaning they should be of the same datatype. We generally use arrays when we are dealing with lot of variables of the same data type. For example, suppose we want to keep track of the scores achieved by 30 NBA teams throughout a season. We have two choices, either we create 30 variables manually or create a single group of these variables called arrays. In array creation, there are basically three steps: declaration, instantiation, and initializing the array.

Declaration of an array: The declaration of the array follows the same logic and rules as declaring variables in the java language like the type of the data and the valid name of the array.

Syntax: \<datatype> \<variablename> \[] or \<datatype> \[] \<variable name>

For example:
int myArray[];
int [] myArray;

What is ArrayList?

ArrayList is a resizable array or we can say it is a dynamic array that is a part of the collection framework in java that is present in the util package. The main advantage of ArrayList over an array is the size of the ArrayList changes during the run time of the program but in the case of an array, the size of the array remains constant once instantiation is done in the java program. Even the deletion of the elements in the ArrayList is much easier than the array in the array. When we delete the middle element in the array we have to rearrange all remaining elements but ArrayList provides us with various inbuilt functions that help to perform many operations easier.

The Declaring of the ArrayList is similar to the array’s Declaration. Similar to arrays, it is required to specify the data type of elements in an ArrayList and also while Instantiation of the ArrayList we need not to mention the size of the ArrayList like in the arrays we have to mention the size of the arrays during the instantiation process.

Syntax:ArrayList\<typename>\<variable name>

For example:
ArrayList <Integer> myList;

Difference Between Array and Arraylist

Array and ArrayList have several differences. Firstly, arrays are of fixed size, determined at the time of declaration, while ArrayLists are dynamically resizable. Secondly, arrays can hold both primitive data types and objects, whereas ArrayLists are limited to object storage, utilizing autoboxing for primitives. Thirdly, ArrayLists come with built-in methods for various operations like adding or removing elements, whereas arrays do not offer such flexibility. Lastly, an ArrayList internally uses an array for data storage, but it automatically manages resizing when necessary.
