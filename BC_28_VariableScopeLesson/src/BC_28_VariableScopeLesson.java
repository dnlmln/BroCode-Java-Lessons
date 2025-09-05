public class BC_28_VariableScopeLesson {

    static int x = 3;               // global variable y has global scope to all methods in this class
    static int y = 4;               // global variable y has global scope to all methods in this class

    public static void main(String[] args) {

        // variable scope = where a variable is accessible
        // local variable = a variable that is declared inside a method
        //                   accessible only by methods where it is declared
        // global variable = a variable that is declared outside a method, usually at the top of a class
        //                   accessible by all methods in a class

        int x = 1;                  // local variable x has local scope to main method

        System.out.println(x);      // prints the value of x from main method
                                    // java will always use the local variable over a global variable if there is a naming conflict

        System.out.println(y);      // prints the value of global variable y from class

        // calling someMethod in order to print the value of x from someMethod
        someMethod();

    }
    public static void someMethod() {
        int x = 2;                  // local variable x has local scope to someMethod method
        System.out.println(x);      // prints the value of x from someMethod method
                                    // java will always use the local variable over a global variable if there is a naming conflict

        System.out.println(y);      // prints the value of global variable y from class
    }
}