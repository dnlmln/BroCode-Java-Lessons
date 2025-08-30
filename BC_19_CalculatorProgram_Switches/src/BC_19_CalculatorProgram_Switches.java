import java.util.Scanner;
public class BC_19_CalculatorProgram_Switches {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double firstNumber = 0;
        double secondNumber = 0;
        double result = 0;
        char operator;
        boolean validOperation = true;

        System.out.print("Enter the first number: ");
        firstNumber = sc.nextDouble();

        System.out.print("Enter the second number: ");
        secondNumber = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, ^): ");
        operator = sc.next().charAt(0);

        switch(operator){
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '*' -> result = firstNumber * secondNumber;
            case '/' -> {
                if(secondNumber == 0){
                    System.out.println("Cannot divide by zero.");
                    validOperation = false;
                }
                else{
                    result = firstNumber / secondNumber;
                } 
            }
            case '^' -> result = Math.pow(firstNumber, secondNumber); 
            default -> {
                System.out.println("Invalid Operator.");
                validOperation = false;
            }
        }

        if(validOperation){
            System.out.printf("Operation:      %f %c %f \n", firstNumber, operator, secondNumber);
            System.out.println("The result is:  " + result);
        }

        sc.close();
    }
}