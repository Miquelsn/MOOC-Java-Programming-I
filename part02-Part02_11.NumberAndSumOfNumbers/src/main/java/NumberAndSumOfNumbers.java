
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int sum=0;
        System.out.println("Give a number: ");
        while(true){
            int numGiveen = Integer.parseInt(scanner.nextLine());
            if(numGiveen==0){
                break;
            }
            sum+=numGiveen;
            num++;
            System.out.println("Give a number: ");
        }
        System.out.println("Number of numbers: " + num);
        System.out.println("Sum of the numbers: "+ sum);
    
    }
}
