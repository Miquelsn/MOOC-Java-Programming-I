
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();
        while(true){
            System.out.print("? ");
            String command = scan.nextLine();
            if(command.equals("Quit")){
                return;
            }
            if(command.equals("Add")){
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String nameLatin = scan.nextLine();
                birds.add(new Bird(name,nameLatin));
            }
            if(command.equals("Observation")){
                boolean found = false;
                System.out.print("Bird? ");
                String name = scan.nextLine();
                    for (Bird bird : birds) {
                        if(bird.getName().equals(name)){
                        
                            bird.observed();
                            found=true;
                        }
                    }
                if(!found){
                    System.out.println("Not a bird!");
                }
                
            }
            if(command.equals("One")){
                boolean found = false;
                System.out.print("Bird? ");
                String name = scan.nextLine();
                    for (Bird bird : birds) {
                        if(bird.getName().equals(name)){
                            System.out.println(bird);
                            found=true;
                        }
                    }
                    if(!found){
                        System.out.println("Not a bird!");
                    }
                
            }
            if(command.equals("All")){

                for (Bird bird : birds) {
                    System.out.println(bird);
                }
            }
        }
    }

}
