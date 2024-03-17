
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int first=Integer.parseInt(scanner.nextLine());
        System.out.println("Where from?");
        int second=Integer.parseInt(scanner.nextLine());
        for (int i =second; i<=first; i++){
            System.out.println(i);
        }
    }
}
