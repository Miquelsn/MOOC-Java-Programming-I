
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=-1;
        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            }
            String[] pieces = text.split(",");
            if(Integer.parseInt(pieces[1])>max){
                max=Integer.parseInt(pieces[1]);
            }
        }
        System.out.println("Age of the oldest: " + max);

    }
}
