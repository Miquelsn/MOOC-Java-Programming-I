import java.util.ArrayList;

public class Recipe {

    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    public Recipe(String name, int cookingTime, ArrayList<String> ingredients){
        this.cookingTime=cookingTime;
        this.name=name;
        this.ingredients =ingredients;
    }
    public String getName(){
        return this.name;
    }
    public Integer getCookingTime(){
        return this.cookingTime;
    }
    public String toString(){
        return this.name+ ", cooking time: "+this.cookingTime;
    }
    public ArrayList<String> getIngredients(){
        return ingredients;
    }
    
}
