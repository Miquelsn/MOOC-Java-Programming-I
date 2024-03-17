import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.dict=dictionary;
        this.scanner=scanner;
    }

    public void start(){
        while(true){

        System.out.println("Command: ");
        String command=scanner.nextLine();
        if(command.equals("end")){
            System.out.println("Bye bye!");
            break;
        }
        if(command.equals("add")){
            System.out.println("Word: ");
            String word=scanner.nextLine();
            System.out.println("Translation: ");
            String translate=scanner.nextLine();
            dict.add(word, translate);
        }
        if(command.equals("search")){
            System.out.println("To be translated: ");
            String word=scanner.nextLine();
            if(dict.translate(word)==null){
                System.out.println("Word "+word+" was not found");
            }else{

            
            System.out.println("Translation: "+dict.translate(word));
            }
        }
        else{
            System.out.println("Unknown command");
        }

    }
    }
}
