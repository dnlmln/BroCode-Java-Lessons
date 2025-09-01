import java.util.Scanner;

public class BC_21_WhileLoopsLesson {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // while loop = run some code forever while some condition remains true


        String name="";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = sc.nextLine();
        }


        System.out.println("Hello " + name);

        //System.out.print("Say something: ");

        sc.close();
    }
}
