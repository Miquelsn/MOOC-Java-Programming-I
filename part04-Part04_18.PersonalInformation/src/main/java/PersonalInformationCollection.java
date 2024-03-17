
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Read the names of persons from the user
        while (true) {
            String firstName = scanner.nextLine();
            if (firstName.isEmpty()) {
                break;
            }
            String lastName = scanner.nextLine();
            String idNumber = scanner.nextLine();
            // Add to the list a new person
            // whose name is the previous user input
            infoCollection.add(new PersonalInformation(firstName,lastName,idNumber));
            System.out.print("\n");
        }
        
        // Print the number of the entered persons, and their individual information
        
        for (PersonalInformation person: infoCollection) {
            System.out.println(person.getFirstName()+ " "+ person.getLastName());
        }
    }
}
