
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=-1;
        String name = "";
        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            }
            String[] pieces = text.split(",");
            if(Integer.parseInt(pieces[1])>max){
                max=Integer.parseInt(pieces[1]);
                name=pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + name);

    }
}
