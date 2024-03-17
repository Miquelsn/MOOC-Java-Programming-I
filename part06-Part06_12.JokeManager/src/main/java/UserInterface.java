
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private JokeManager jokeManager;

    public UserInterface(JokeManager manager, Scanner scanner) {
        jokeManager = manager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String commands = this.scanner.nextLine();
            
            if (commands.equals("X")) {
                break;
            } else if (commands.equals("1")) {
                System.out.println("Write the joke to be added: ");
                commands = this.scanner.nextLine();
                jokeManager.addJoke(commands);
            } else if (commands.equals("2")) {
                System.out.println(jokeManager.drawJoke());
            } else if (commands.equals("3")) {
                System.out.println("Printing the jokes.");
                jokeManager.printJokes();
            }
        }
    }
}