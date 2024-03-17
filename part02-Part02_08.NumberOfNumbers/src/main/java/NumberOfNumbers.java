
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("Give a number:");
        while(0!=Integer.parseInt(scanner.nextLine())){
            num++;
            System.out.println("Give a number:");
        }
        System.out.println("Number of numbers: "+ num);
    }
}
