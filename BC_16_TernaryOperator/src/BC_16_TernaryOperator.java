public class BC_16_TernaryOperator {
    public static void main(String[] args) throws Exception {

        // ternary operator ? = Return 1 of 2 values if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;


        // Using if statements
        // int score = 70;
        // if(score >= 60){
        //     System.out.println("PASS");
        // }
        // else{
        //     System.out.println("FAIL");
        // }


        // Using ternary operator

        int score = 50;
        String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        System.out.println(passOrFail);

        // Check if number is even or odd using modulus (%) operator
        int number = 3;
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
    
        System.out.println(evenOrOdd);

        // 

        int hours = 13;
        //String timeOfDay = (hours / 12 >= 1) ? "PM" : "AM";
        String timeOfDay = (hours < 12) ? "AM" : "PM";

        System.out.println(timeOfDay);

        int income = 60000;
        double taxRate = (income >= 40000) ? 0.24 : 0.15;

        System.out.println(taxRate);

    }
}
