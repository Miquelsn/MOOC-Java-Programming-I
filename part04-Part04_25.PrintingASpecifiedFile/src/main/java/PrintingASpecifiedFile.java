
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String path = scanner.nextLine();
        try (Scanner fileReader = new Scanner(Paths.get(path))) {

            // we read the file until all lines have been read
            while (fileReader.hasNextLine()) {
                // we read one line
                String row = fileReader.nextLine();
                // we print the line that we read
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
