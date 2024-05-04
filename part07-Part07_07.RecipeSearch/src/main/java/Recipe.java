import java.util.List;

public class Recipe {

    private final String name;
    private final int preparationTime;
    private final List<String> ingredients;

    public Recipe(String name, int preparationTime, List<String> ingredients){
        this.name = name;
        this.preparationTime = preparationTime;
        this.ingredients = ingredients;
    }

    public String getName(){
        return name;
    }
    public int getPreparationTime(){
        return preparationTime;
    }

    public List<String> getIngredients(){
        return ingredients;
    }

    @Override
    public String toString(){
        return name + ", cooking time: " + preparationTime;
    }
}
