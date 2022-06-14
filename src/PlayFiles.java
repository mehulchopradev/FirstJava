import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class PlayFiles {

    public static void main(String[] args) {
        String filePath = "/Users/mehulchopra/Documents/training/globalpayex/workspace/FirstJava/src/AdvancedArrayList.java";

        // check if the file exists or no
        System.out.println(Files.exists(Path.of(filePath)));

        String doesNotExistPath = "/Users/mehulchopra/Documents/training/globalpayex/workspace/FirstJava/src/AdvancedArrayLi";
        System.out.println(Files.exists(Path.of(doesNotExistPath)));

        // check if its a directory or a regular file
        System.out.println(Files.isRegularFile(Path.of(filePath)));
        String dirPath = "/Users/mehulchopra/Documents/training/globalpayex/workspace/FirstJava/src";
        System.out.println(Files.isDirectory(Path.of(dirPath)));

        System.out.println("All files in the src directory");
        // list all the files in the src directory. Just lists till depth 1
        /* Stream<Path> paths = null;
        try {
            paths = Files.list(Path.of(dirPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        paths.forEach(path -> System.out.println(path.getFileName()));
        paths.close(); // because this Stream is connected to the file system
        // To prevent memory leak, always close this stream */

        try (Stream<Path> files = Files.list(Path.of(dirPath))) {
            files.forEach(path -> System.out.println(path.getFileName()));
            // only resources implementing the AutoCloseable interface can be put in try-with-resources
            // once the try block is done, files stream will be auto closed!
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("*******All files in the src directory recursive*******");
        // listing all files/directories in src folder recursively
        try (Stream<Path> recursiveStream = Files.walk(Path.of(dirPath))) {
            recursiveStream
                    .filter(path -> Files.isRegularFile(path))
                    .forEach(path -> System.out.println(path.getFileName()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
