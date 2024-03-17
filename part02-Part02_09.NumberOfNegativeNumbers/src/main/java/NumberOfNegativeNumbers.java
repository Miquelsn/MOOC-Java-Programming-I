
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("Give a number: ");
        while(true){
            int numGiveen = Integer.parseInt(scanner.nextLine());
            if(numGiveen==0){
                break;
            }else if(numGiveen<0){
                num++;
            }
            System.out.println("Give a number: ");
        }
        System.out.println("Number of negative numbers: "+ num);
    }
}
