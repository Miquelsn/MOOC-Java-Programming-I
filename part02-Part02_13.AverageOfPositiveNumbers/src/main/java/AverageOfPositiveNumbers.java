
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        while (true) {
            int numGiveen = Integer.parseInt(scanner.nextLine());
            if (numGiveen == 0) {
                break;
            }
            if (numGiveen > 0) {
                sum += numGiveen;
                num++;
            }
        }
        if (num == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println("Average of the numbers: " + 1.0 * sum / num);
        }
    }
}
