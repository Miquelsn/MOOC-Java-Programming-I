
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longest=-1;
        int age=0;
        int num=0;
        String name = "";
        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            }
            String[] pieces = text.split(",");
            age+=Integer.parseInt(pieces[1]);
            num++;
            if(pieces[0].length()>longest){
                longest=pieces[0].length();
                name=pieces[0];
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0*age/num);

    }
}
