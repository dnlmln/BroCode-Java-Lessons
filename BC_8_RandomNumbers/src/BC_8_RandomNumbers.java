import java.util.Random;

public class BC_8_RandomNumbers {
    public static void main(String[] args) throws Exception {

        Random rand = new Random();

        int number1;
        double number2;
        boolean isHeads;

        number1 = rand.nextInt(1,101);
        number2 = rand.nextDouble(1,101);
        isHeads = rand.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(isHeads);

        if(isHeads){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }
    }
}
