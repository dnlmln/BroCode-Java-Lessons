public class BC_20_LogicalOperatorsLesson {
    public static void main(String[] args) throws Exception {

        // &&   And = All statements must be true for the code to be executed.
        // ||   Or  = If at least one statement is true the code is executed.
        // !    Not = reverses a boolean

        double temp = -40;
        boolean isSunny = false;

        if( temp <= 30 && temp >= 0 && isSunny){
            System.out.print("Comfortable");
            System.out.println(" and Sunny");
        }
        else if( temp < 30 && temp >= 0 && !isSunny){
            System.out.print("Comfortable");
            System.out.println(" and Cloudy");
        }
        else if( temp > 30 || temp < 0){
            System.out.print("Too weather is bad");
        }
        else{
            System.out.println("Dunno");
        }




    }
}
