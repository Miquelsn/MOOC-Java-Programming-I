
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int count = 0;
        try (Scanner numberScanner = new Scanner (Paths.get(file))) {
            while(numberScanner.hasNextLine()){
                int number = Integer.parseInt(numberScanner.nextLine());
                if(number>=lowerBound && number<=upperBound){
                    count++;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Reading the file " + file + " failed.");
        }
        System.out.println("Numbers: "+count);
        }
    }


