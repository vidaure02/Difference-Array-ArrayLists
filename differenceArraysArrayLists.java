import java.util.ArrayList;

public class differenceArraysArrayLists {

	public static void main(String[] args) {
		// Arrays
		int[] array = new int[5];
		
		// Initialization
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;
		
        System.out.println("Array Elements:" );
        for (int i = 0; i <array.length; i++) {       
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        // Initialization
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("ArrayList Elements:");
     
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        // Demonstrating differences
        // Adding elements to array (not dynamic)
        // Uncommenting the line below would result in a compilation error
        // array[5] = 6;

        // Adding elements to ArrayList (dynamic)
        arrayList.add(6);

        System.out.println("Updated ArrayList Elements:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
