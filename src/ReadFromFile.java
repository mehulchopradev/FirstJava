import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class ReadFromFile {

    public static void main(String[] args) {
        String filePath = "/Users/mehulchopra/Documents/training/globalpayex/workspace/FirstJava/src/AdvancedArrayList.java";

        System.out.println("******* Read all lines lazily**************");
        // read from above file
        try (Stream<String> lines = Files.lines(Path.of(filePath))) {
            // the stream reads lazily from the file and not in one go
            lines.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("******* Read all lines in one go**************");
        filePath = "/Users/mehulchopra/Documents/training/globalpayex/workspace/FirstJava/src/CreateAccount.java";
        // read from above file in one go
        // ideal for smaller files
        try {
            List<String> lines = Files.readAllLines(Path.of(filePath));
            System.out.println(lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
