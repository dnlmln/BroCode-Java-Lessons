import java.util.Arrays;
import java.util.Scanner;
public class BC_32_ArrayUserInputLesson {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // array with 3 elements
        //String[] foods = {"pizza", "taco", "hamburger"};

        // empty array that has space for 3 values
        String[] foods = new String[3];

        //
        //foods[0] = "Pizza";
        //foods[1] = "taco";
        //foods[2] = "hamburger"

        //System.out.print("What is the first food: ");
        //foods[0] = sc.nextLine();
        //System.out.print("What is the second food: ");
        //foods[1] = sc.nextLine();
        //System.out.print("What is the third food: ");
        //foods[2] = sc.nextLine();

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter your food: ");
            foods[i] = sc.nextLine();
        }


        System.out.println("You have " + foods.length + " elements in your array.");
        Arrays.sort(foods);

        for(String food : foods){
            System.out.print(food + " ");
        }

        sc.close();
    }
}