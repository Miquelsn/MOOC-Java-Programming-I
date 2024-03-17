import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Statics numbers;
    
    public UserInterface(Scanner scanner, Statics numbers){
        this.scanner = scanner;
        this.numbers = numbers;
    }
    
    public void start(){
        while (true) {
            System.out.println("Enter point totals, -1 stops:");
            String input = this.scanner.nextLine();

            if (input.equals("-1")) {
                break;
            }

            int inputNumber = Integer.valueOf(input);
            if (inputNumber >= 0 && inputNumber <= 100) {
                numbers.add(inputNumber);
            } else if (inputNumber < 0 || inputNumber > 100) {
                continue;
            }
        }
        System.out.println(numbers.toString());
        numbers.printGrades();
        
    }
}