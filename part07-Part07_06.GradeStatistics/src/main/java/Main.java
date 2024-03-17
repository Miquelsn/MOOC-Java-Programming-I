import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statics statics = new Statics();

        UserInterface userInterface = new UserInterface(scanner, statics);
        userInterface.start();
    }
}