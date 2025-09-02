public class BC_24_BreakContinueLesson {
    public static void main(String[] args) throws Exception {

        // break    = break out of a loop (STOP)
        // continue = skip current iteration fo a loop (SKIP)

        for(int i = 0; i <= 10 ; i++){

            if(i == 5){
                continue;
            }

            if(i == 8){
                break;
            }

            System.out.print(i + " ");
        }

    }
}
