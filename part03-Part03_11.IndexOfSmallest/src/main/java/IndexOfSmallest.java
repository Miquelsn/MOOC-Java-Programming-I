
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            list.add(input);
        }
        int smallest=9999;
        ArrayList<Integer> index = new ArrayList<>();
        for(int i = 0; i<list.size();i++){
            if(list.get(i)<smallest){
                smallest=list.get(i);
                index.clear();
                index.add(i);
            }else if(list.get(i)==smallest){
                index.add(i);
            }
        }
        System.out.println("Smallest number: "+ smallest);
        for (int i = 0; i < index.size(); i++) {
            System.out.println("Found at index: "+ index.get(i));
        }
        
    }
}
