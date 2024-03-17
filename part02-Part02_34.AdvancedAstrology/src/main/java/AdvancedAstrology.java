
public class AdvancedAstrology {

    public static void printStars(int number) {
        // first part of the exercise
        for(int i=0; i<number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int i=0; i<number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for(int i=1; i<=size;i++){
            printSpaces(size-i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        int counter = 1;
        int starsCounterSum = 0;
        int starsCounter = 1;
        int number = height;
        for(int i = 1; i<=number; i++){
            height--;
            printSpaces(height);
            printStars(starsCounter);
            starsCounterSum = starsCounter += 2;
        }
        number -= 2;
        for(int i=0; i<2; i++){
            printSpaces(number);
            printStars(3);
        }

    
    
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
