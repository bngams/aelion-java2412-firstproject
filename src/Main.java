public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("My args are:");
        // parcours du tableau avec foreach /!\ au cas d'utilisation / perf.
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}