
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString(){
        String stringOutput = "";
        String listOfElements = "";
        
        for (String ele : elements) {
            if (ele.equals(elements.get(elements.size() - 1))) {
                listOfElements += ele;
            } else {
                listOfElements += ele + "\n";
            }
        }
        if (elements.size() == 1) {
            stringOutput = "The collection " + this.name + " has 1 element:\n" + listOfElements;
        } else if (elements.size() == 0) {
            stringOutput = "The collection " + this.name + " is empty.";
        } else {
            stringOutput = "The collection " + this.name + " has " + elements.size() + " elements:\n" + listOfElements;
        }
        return stringOutput;
        
    }
    
}
