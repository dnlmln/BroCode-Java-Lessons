public class BC_13_StringMethods {
    public static void main(String[] args) throws Exception {

        String name = "Daniel Milani";
        String namewithwhitespace = "    Daniel Milani    ";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("i");
        int lastIndex = name.lastIndexOf("i");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);


        name = name.toUpperCase();
        System.out.println(name);

        name = name.toLowerCase();
        System.out.println(name);

        name = namewithwhitespace.trim();
        System.out.println(name);

        name = name.replace("i", "I");
        System.out.println(name);

        boolean isNameEmpty = name.isEmpty();
        System.out.println(isNameEmpty);

        if(name.isEmpty()){
            System.out.println("Name is Empty");
        }
        else{
            System.out.println("Name is NOT empty");
        }

        if(name.contains(" ")){
            System.out.println("There is a space!");
        }
        else{
            System.out.println("There is no space!");
        }

        if(name.equals("Daniel Milani")){
            System.out.print("They are equal... ");
            System.out.println(name);
        }
        else{

            System.out.print("They are NOT equal ... ");
            System.out.println(name);
        }


        if(name.equalsIgnoreCase("Daniel Milani")){
            System.out.print("They are equal... ");
            System.out.println(name);
        }
        else{

            System.out.print("They are NOT equal ... ");
            System.out.println(name);
        }
    }
}
