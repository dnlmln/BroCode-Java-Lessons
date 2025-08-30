import java.util.Scanner;
public class BC_19_CalculatorProgram_IfStatement_Basic {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Declaring variables
        double firstNumber = 0;
        double secondNumber = 0;
        double result = 0;
        char operator;

        // Assigning to variables what is input by user.
        System.out.print("Enter the first number: ");
        firstNumber = sc.nextDouble();

        System.out.print("Enter the second number: ");
        secondNumber = sc.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        operator = sc.next().charAt(0);

        // Running operations
        if(operator == '+'){
            result = firstNumber + secondNumber;
        }
        else if(operator == '-'){
            result = firstNumber - secondNumber;
        }
        else if(operator == '*'){
            result = firstNumber * secondNumber;
        }
        else if(operator == '/'){
            result = firstNumber / secondNumber;
        }
        else{
            System.out.println("Invalid Operator.");
        }
        
        // Displaying results
        System.out.printf("Operation:      %f %c %f \n", firstNumber, operator, secondNumber);
        System.out.println("The result is:  " + result);

        sc.close();
    }
}
