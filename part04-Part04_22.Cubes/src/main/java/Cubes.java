
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(true){
            String text = scanner.nextLine();
            if(text.equals("end")){
                return;
            }
            int number = Integer.parseInt(text);
            System.out.println(number*number*number);
        }
        
    
    }
}
