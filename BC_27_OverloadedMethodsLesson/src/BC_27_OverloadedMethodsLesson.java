public class BC_27_OverloadedMethodsLesson {
    public static void main(String[] args) {

        // overloaded methods - methods with the same name but different parameters (type, number, order)
        // method signature - method name + parameter list (type, number, order)
        // A method's name and parameter list (type, number, order) make up its signature.
        // Two methods can have the same name as long as their signatures are different.
        // This is called method overloading.

        System.out.println(add(1, 2));

        System.out.println(add(1,2,3));

    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add (double a, double b, double c) {
        return a + b + c;
    }

}