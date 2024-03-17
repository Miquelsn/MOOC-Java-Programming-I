
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
    public String longest() {
        if(elements.isEmpty()){
            return null;
        }else{
            int max=0;
            String longestName="";
            for (String name : elements) {
                if(name.length()>max){
                    max=name.length();
                    longestName=name;
                }
            }
            return longestName;
        }
    }

}
