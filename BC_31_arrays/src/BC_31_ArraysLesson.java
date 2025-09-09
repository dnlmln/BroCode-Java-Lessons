import java.util.Arrays;

public class BC_31_ArraysLesson {
    public static void main(String[] args) {

        // arrays = a collec5ion of values of the same type.

        // Create an array and print the first element.
        System.out.println("\n #######################");
        System.out.println("# crate array of 4 elements and print element 0");
        String[] fruits = {"apple", "orange", "banana", "coconut"};
        System.out.println(fruits[0]);

        // changing element 0 in the array from apple to pineapple.
        System.out.println("\n #######################");
        System.out.println("# change element 0 of the array");
        fruits[0] = "pineapple";
        System.out.println(fruits[0]);

        // to find the length of an array.
        System.out.println("\n #######################");
        System.out.println("# find the length of the array");
        int numOfFruites = fruits.length;
        System.out.println(numOfFruites);

        // print all the elements from the array.
        System.out.println("\n #######################");
        System.out.println("# printing elements of the array");
        for(int i = 0; i < fruits.length; i++ ){
            System.out.print(fruits[i] + " ");

        }


        // print all the elements from the array using enhanced for loop (or a for each loop).
        System.out.println("\n #######################");
        System.out.println("# printing elements of the array with enhanced for loop");
        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }

        // sort output
        System.out.println("\n #######################");
        System.out.println("# sort output");
        Arrays.sort(fruits);
        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }

        // fill method for arrays
        System.out.println("\n #######################");
        System.out.println("# fill an array with a given value");
        Arrays.fill(fruits, "pineapple");
        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }
    }
}