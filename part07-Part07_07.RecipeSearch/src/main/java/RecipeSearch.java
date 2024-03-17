
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        boolean debug = false;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipesList = new ArrayList<>();
            System.out.println("File to read:");
            String file;
            if(debug){
               file ="recipes.txt";
            }else{
             file = scanner.nextLine();
            }
            try (Scanner fileScanner= new Scanner(Paths.get(file));){
            while(fileScanner.hasNextLine()){
                System.out.println("Nuevo");
                String name=fileScanner.nextLine();
                String cookingTime=fileScanner.nextLine();
                ArrayList<String> ingredientList = new ArrayList<>();
                while(true){

                    if(fileScanner.hasNextLine()){

                    
                    String next=fileScanner.nextLine();
                    System.out.println(next);
                    
                    if(next.isEmpty()){
                        System.out.println("Final");
                        break;
                    }
                    ingredientList.add(next);
                }else{
                    break;
                }
            }
                Recipe recipeNew = new Recipe(name, Integer.parseInt(cookingTime),ingredientList);
                recipesList.add(recipeNew);
            }
        }
            catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
            while (true) {
            System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program");
            String text= scanner.nextLine();
            if(text.equals("stop")){
                return;
            }
            if(text.equals("list")){
                for (Recipe recipe : recipesList) {
                    System.out.println(recipe);
                }
            }
            if(text.equals("find name")){
                System.out.println("Searched word: ");

                String name = scanner.nextLine();
                for (Recipe recipe : recipesList) {
                    if(recipe.getName().contains(name)){
                        System.out.println(recipe);
                    }
                }
            }

            if(text.equals("find cooking time")){
                System.out.println("Max cooking time: ");

                int maxCooking = Integer.parseInt(scanner.nextLine());

                System.out.println("Recipes:");
                for (Recipe recipe : recipesList) {
                    if(recipe.getCookingTime()<=maxCooking){
                        System.out.println(recipe);
                    }
                }
            }

            if(text.equals("find ingredient")){
                String ingredient = scanner.nextLine();
                for (Recipe recipe : recipesList) {
                    for(String ing:recipe.getIngredients()){
                        if(ing.equals(ingredient)){
                            System.out.println(recipe);
                        }
                    }
                }
            }
        }
            } 

        }