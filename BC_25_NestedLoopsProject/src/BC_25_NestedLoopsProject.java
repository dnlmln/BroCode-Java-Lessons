import java.util.Scanner;
public class BC_25_NestedLoopsProject {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the number or rows:    ");
        rows = scanner.nextInt();

        System.out.print("Enter the number or columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use:     ");
        symbol = scanner.next().charAt(0);

        //System.out.println(rows);
        //System.out.println(columns);
        //System.out.println(symbol);

        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= columns; j++){
                System.out.print(symbol + " ");
            }
            System.out.println(" ");
        }

        scanner.close();
    }
}