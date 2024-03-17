import java.util.ArrayList;

public class Hold {

    private int maxWeigth;
    private int currentWeight;
    private ArrayList<Suitcase> list;
    public Hold(int maxWeigth){
        this.list=new ArrayList<>();
        this.maxWeigth=maxWeigth;
        this.currentWeight=0;
    }

    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight()+this.currentWeight<=maxWeigth){
            list.add(suitcase);
            currentWeight+=suitcase.totalWeight();
        }
    }
    public void printItems(){
        for (Suitcase suitcase : list) {
            suitcase.printItems();
        }
    }
    public String toString(){
        return list.size() +" suitcases (" + currentWeight + " kg)";
    }
}
