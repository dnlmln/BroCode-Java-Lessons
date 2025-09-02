import java.util.Scanner;
public class BC_23_ForLoopsProject {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Countdown time.

        int timer;

        System.out.print("Enter a number: ");
        timer = sc.nextInt();


        for(int i = timer; i > 0; i--){
            System.out.print(i + " ");
            Thread.sleep(1000);
        }

        System.out.println("\nHappy new year!!!");

        sc.close();
    }
}
