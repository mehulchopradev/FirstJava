import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class FilePlusMathsExecutorService {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(() -> {
            String source = "/Users/mehulchopra/Documents/training/globalpayex/workspace/FirstJava/src/AdvancedArrayList.java";
            String destination = "/Users/mehulchopra/Downloads/AdvancedArrayListcopy.java";

            // IO operation code
            //
            try {
                Files.copy(Path.of(source), Path.of(destination), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            System.out.println("File copied!!!");
        });

        executorService.execute(() -> {
            String source = "/Users/mehulchopra/Documents/training/globalpayex/workspace/FirstJava/src/ContainsElement.java";

            try (Stream<String> lines = Files.lines(Path.of(source))) {
                lines.forEach(System.out::println);
                System.out.println("File read!!!");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        // CPU operation code
        int n = 30;
        MathSeries mathSeries = new MathSeries(new Random());
        System.out.println(mathSeries.fibo(n));
        System.out.println("Fibo series!!!");

        executorService.shutdown();
    }
}
