
import java.util.Scanner;

public class AverageOfNumbers {

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
        System.out.println("Average of the numbers: "+ 1.0*sum/num);
    
    }
}
