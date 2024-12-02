import java.util.ArrayList;
import java.util.List;

public class LoopBenchmark {
    public static void main(String[] args) {
        int size = 10_000_000; // Number of elements to benchmark
        List<Integer> numbers = new ArrayList<>(size);

        // Initialize the list with numbers
        for (int i = 0; i < size; i++) {
            numbers.add(i);
        }

        // Benchmark foreach loop
        long startTime = System.nanoTime();
        int sumForEach = 0;
        for (Integer number : numbers) {
            sumForEach += number;
        }
        long endTime = System.nanoTime();
        System.out.println("Foreach loop time: " + (endTime - startTime) + " ns");

        // Benchmark traditional for loop
        startTime = System.nanoTime();
        int sumFori = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sumFori += numbers.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Fori loop time: " + (endTime - startTime) + " ns");

        // Validate results are the same
        if (sumForEach == sumFori) {
            System.out.println("Both loops produced the same result.");
        } else {
            System.out.println("Results are different!");
        }
    }
}
