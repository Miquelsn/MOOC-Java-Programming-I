import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeigth;
    private int currentWeight;
    public Suitcase(int weigth){
        this.maxWeigth=weigth;
        this.items=new ArrayList<>();
        this.currentWeight=0;
    }
    public void addItem(Item item){
        if(item.getWeight()+this.currentWeight<=maxWeigth){
            items.add(item);
            currentWeight+=item.getWeight();
        }
        
    }
    public int totalWeight(){
        return this.currentWeight;
    }
    public void printItems(){
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        int max=0;
        Item heaviest=null;
        for (Item item : items) {
            if(item.getWeight()>max){
                heaviest=item;
                max=item.getWeight();
            }
        }
        return heaviest;
    }
    public String toString(){
        if(items.size()==0){
            return "no items ()" + currentWeight + " kg)";
        }
        if(items.size()==1){
            return items.size()+" item (" + currentWeight + " kg)";
        }
        return items.size()+" items (" + currentWeight + " kg)";
    }
}
