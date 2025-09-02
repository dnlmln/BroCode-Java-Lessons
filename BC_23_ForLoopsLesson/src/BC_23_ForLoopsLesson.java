import java.util.Scanner;
public class BC_23_ForLoopsLesson {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // for loops = execute some code a certain amount of times
        // statement1 = used to set up a counter. i = 0 (i starts at 0)
        // statement2 = when do we want to stop. 1 < 10 (i stops at 10)
        // statement3 = increment counter. i++ (increase by 1)

        int max;

        System.out.print("How many times to you want to loop:  ");
        max = sc.nextInt();

        System.out.print("Example of increment by 1: ");

        // increment i from 1 to 10 by 1
        for(int i = 0; i <= max; i++){
            System.out.print(i + " ");
        }

        System.out.println("");
        System.out.print("Example of decrement by 1: ");

        // decrement i from 10 to 1 by 1
        for(int i = max; i >= 1; i--){
            System.out.print(i + " ");
        }

        System.out.println("");
        System.out.print("Example of increment by 2: ");

        // decrement i from 10 to 1 by 2
        for(int i = 1; i <= 10; i+=2){
            System.out.print(i + " ");
        }

        System.out.println("");
        System.out.print("Example of decrement by 2: ");

        // decrement i from 10 to 1 by 2
        for(int i = 10; i >= 1; i-=2){
            System.out.print(i + " ");
        }

        System.out.println("");

        sc.close();
    }
}
