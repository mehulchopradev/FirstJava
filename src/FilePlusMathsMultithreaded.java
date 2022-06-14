import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Random;

public class FilePlusMathsMultithreaded {
    public static void main(String[] args) {
        // send the IO logic for execution on a separate thread
        Thread thread = new Thread(() -> {
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
        thread.start(); // schedules ur Thread for execution

        // CPU operation code
        int n = 30;
        MathSeries mathSeries = new MathSeries(new Random());
        System.out.println(mathSeries.fibo(n));
        System.out.println("Fibo series!!!");
    }
}
