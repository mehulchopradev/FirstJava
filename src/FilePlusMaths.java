import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Random;

public class FilePlusMaths {

    // single threaded way
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName()); // main thread

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

        // CPU operation code
        int n = 30;
        MathSeries mathSeries = new MathSeries(new Random());
        System.out.println(mathSeries.fibo(n));
        System.out.println("Fibo series!!!");
    }
}
