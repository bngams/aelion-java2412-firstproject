/**
 * My App class with base syntax
 * classname with Pascal Case
 */
public class App {

    /**
     *  creer des attributs (variable de classe)
     *  Camel Case syntax
     */
    String appTitle = "Welcome";

    /**
     * Main method to run code
     * Camel Case syntax
     * @param args
     */
    public static void main(String[] args) {
        // créer des variables
        String name; // déclaration
        name = "Boris"; // assignation


        // types objects
        String otherName = "Boris";
        String hello = "Hello, my name is ";
        Boolean b = true;
        Integer i = 10; // auto boxing
        //Integer ibis = new Integer(10); // complete syntax
        Long l = 10L;
        Double d = 10.5;
        Float f = 10.5f;

        // types primitifs
        char[] helloPrim = {'h', 'e', 'l', 'l', 'o'};
        int iprim = 10;
        long lprim = 10L;
        double dprim = 10.5;
        float fprim = 10.5f;
        boolean bprim = true;
    }
}
