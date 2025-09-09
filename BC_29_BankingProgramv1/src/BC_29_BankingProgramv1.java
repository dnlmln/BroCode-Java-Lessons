import java.util.Scanner;
public class BC_29_BankingProgramv1 {

    //static double balance = 0.0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Java Banking Program

        // Declare Variables

        double balance = 0.0;
        double depositAmount = 0.0;
        double withdrawAmount = 0.0;
        char userChoice;
        boolean isRunning = true;

        do{
            // Display Menu
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrawal");
            System.out.println("4. Quit");
            System.out.println("***************");
            System.out.print("Choose (1-4):   ");

            // Get and Process Users Input
            userChoice = sc.next().charAt(0);

            if(userChoice == '4'){
                System.out.println("Quitting");
                isRunning = false;
            } else if (userChoice == '1') {
                System.out.println("***************");
                System.out.println("Balance is: " + showBalance(balance));
                //System.out.println("Balance is: " + balance);
            } else if (userChoice == '2') {
                System.out.print("How much would you like to deposit: ");
                depositAmount = sc.nextDouble();
                //System.out.println("Balance Before: " + balance);
                //System.out.println("Deposit Amount: " + depositAmount);
                //makeDeposit(balance, depositAmount);
                balance = makeDeposit(balance, depositAmount);
                //System.out.println("Balance After: " + balance);
            } else if (userChoice == '3') {
                System.out.print("How much would you like to withdraw: ");
                withdrawAmount = sc.nextDouble();
                //System.out.println("Balance Before: " + balance);
                //System.out.println("Withdraw Amount: " + withdrawAmount);
                //makeWithdraw(balance, withdrawAmount);
                balance = makeWithdraw(balance, withdrawAmount);
                //System.out.println("Balance After: " + balance);
            }

        }while(isRunning);

        sc.close();
    }
    public static double showBalance(double balance){
        return balance;
    }
    public static double makeDeposit(double balance, double depositAmount){
        balance = balance + depositAmount;
        return balance;
    }
    public static double makeWithdraw(double balance, double withdrawAmount){
        balance =  balance - withdrawAmount;
        return balance;
    }
}