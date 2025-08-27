import java.util.Scanner;
public class BC_11_CompountInterestCalculator {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // Compound Interest Calculator
        //  A = P(1+r/n)ⁿᵗ
        //	A → the future value (the total amount after interest is applied)
        //	P → the principal (the initial amount of money you invest or borrow)
        //	r → the annual interest rate (expressed as a decimal, e.g. 5% = 0.05)
        //	n → the number of times the interest is compounded per year (e.g. 12 for monthly, 4 for quarterly, 1 for yearly, 365 for daily)
        //	t → the time in years 

        double futurVal;
        double principalVal;
        double annualInterest;
        int compoundNum;
        int yearsNum;

        futurVal = 0;
        principalVal = 0;
        annualInterest = 0;
        compoundNum = 0;
        yearsNum = 0;

        System.out.println("Hello. Welcom to a Compound Interest Calculator.");

        System.out.print("How much money would you like to invest: ");
        principalVal = sc.nextDouble();

        System.out.print("What is the annual interest for your investment in %: ");
        annualInterest = sc.nextDouble();

        System.out.print("How many times per year is the interest compounded.(12 for monthly, 1 for yearly): ");
        compoundNum = sc.nextInt();

        System.out.print("For how many years will you keep your investment: ");
        yearsNum = sc.nextInt();

        // Using println
        //System.out.println("You want invest " + principalVal + "$");
        //System.out.println("At an interest rate of " + annualInterest + "%.");
        //System.out.println("Compounded " + compoundNum + " time(s) every year.");
        //System.out.println("For " + yearsNum + " year(s).");
        //System.out.println("Your investment will be worth: " + FuturVal);
       
        //  A = P(1+r/n)ⁿᵗ
        futurVal = principalVal * Math.pow((1 + ( annualInterest / 100 ) / compoundNum ), compoundNum * yearsNum );

        // Using printf
        //System.out.printf("You want invest $%.2f dollars. \n", principalVal);
        System.out.printf("If you invest $%.2f dollars at an annual interest rate of %.1f%% compounded %d time(s) per year for %d year(s) your investment will be worth $%.2f.  \n", principalVal, annualInterest, compoundNum, yearsNum, futurVal);

        sc.close();
    }
}
