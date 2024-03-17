
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");
        String text=scan.nextLine();
        System.out.println("Give an integer: ");
        Integer number = Integer.parseInt(scan.nextLine());
        System.out.println("Give a double: ");
        Double number_double=Double.parseDouble(scan.nextLine());
        System.out.println("Give a boolean:");
        Boolean bool=Boolean.parseBoolean(scan.nextLine());
        System.out.println("You gave the string "+text);
        System.out.println("You gave the integer "+ number);
        System.out.println("You gave the double " + number_double);
        System.out.println("You gave the boolean " + bool);
    }
}