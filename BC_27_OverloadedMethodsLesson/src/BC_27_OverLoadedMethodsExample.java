public class BC_27_OverLoadedMethodsExample {

    public static void main(String[] args) {

        // overloaded methods - methods with the same name but different parameters (type, number, order)
        // method signature - method name + parameter list (type, number, order)
        // A method's name and parameter list (type, number, order) make up its signature.
        // Two methods can have the same name as long as their signatures are different.
        // This is called method overloading.

        String pizza;

        pizza = bakePizza("flatbread", "pepperoni",  "mozzarella");
        System.out.println(pizza);

        System.out.println(bakePizza("thincrust", "olive", "havarti"));

    }
    static String bakePizza(String bread, String topping,  String cheese) {
        return bread + " , " + topping +  " and " + cheese + " pizza";
    }
}
