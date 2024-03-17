
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Items> itemArrayList = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String item = scanner.nextLine();
            if (item.isEmpty()) {
                break;
            }

            Items itemNew = new Items(identifier, item);

            if (!(itemArrayList.contains(itemNew))) {
                itemArrayList.add(itemNew);
            }

           

        }

        for (Items item : itemArrayList) {
            System.out.println(item);
        }

    }
}