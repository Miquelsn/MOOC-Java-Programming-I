import java.util.Scanner;


public class UserInterface {
    private TodoList listTask;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner){
        listTask=list;
        this.scanner=scanner;
    }
    public void start(){
        while (true) {
            System.out.println("Command: ");
            String command=scanner.nextLine();
            if(command.equals("stop")){
                return;
            }
            if(command.equals("add")){
                System.out.println("To add: ");
                String task=scanner.nextLine();
                listTask.add(task);
            }
            if(command.equals("list")){
                listTask.print();
            }
            if(command.equals("remove")){
                int index=Integer.parseInt(scanner.nextLine());
                listTask.remove(index);
            }
        }
    }
}
