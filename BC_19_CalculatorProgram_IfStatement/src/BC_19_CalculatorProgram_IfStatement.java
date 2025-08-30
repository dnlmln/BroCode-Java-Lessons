import java.util.Scanner;
public class BC_19_CalculatorProgram_IfStatement {
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
            if(secondNumber == 0){
                System.out.println("Cannot divide by zero.");
                validOperation = false;
            }
            else{
                result = firstNumber / secondNumber;
            }
        }
        else if(operator == '^'){
            result = Math.pow(firstNumber, secondNumber);
        }
        else{
            System.out.println("Invalid Operator.");
            validOperation = false;
        }

        if(validOperation){
            System.out.printf("Operation:     %f %c %f \n", firstNumber, operator, secondNumber);
            System.out.println("The result is: " + result);
        }

        sc.close();
    }
}