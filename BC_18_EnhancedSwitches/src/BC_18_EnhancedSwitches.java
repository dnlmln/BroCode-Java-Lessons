import java.util.Scanner;
public class BC_18_EnhancedSwitches {
    public static void main(String[] args) throws Exception {

        // Enhanced Switch = A replacement to many else if statements

        // String day = "Blahday";
        Scanner sc = new Scanner(System.in);

        System.out.print("What day of the week is it? ");
        String day = sc.nextLine();

        //switch(day.toLowerCase()){
        //    case "monday" -> System.out.println("It's a weekday.");
        //    case "tuesday" -> System.out.println("It's a weekday.");
        //    case "wednesday" -> System.out.println("It's a weekday.");
        //    case "thursday" -> System.out.println("It's a weekday.");
        //    case "friday" -> System.out.println("It's a weekday.");
        //    case "saturday" -> System.out.println("It's the weekend.");
        //    case "sunday" -> System.out.println("It's the weekend.");
        //    default -> System.out.println(day + " is not a day.");
        //}

        switch(day.toLowerCase()){
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("It's a weekday.");
            case "saturday", "sunday" -> System.out.println("It's the weekend.");
            default -> System.out.println(day + " is not a day.");
        }

        sc.close();
    }
}
