import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.IOException;

public class RecipesCollection {

    private List<Recipe> recipes;

    public RecipesCollection() {
        this.recipes = new ArrayList<>();
    }

    public void fillCollectionFromFile(String file) {
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String recipeName = scanner.nextLine();
                int preparationTime = Integer.parseInt(scanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                while (scanner.hasNextLine()) {
                    String ingredient = scanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }
                Recipe recipe = new Recipe(recipeName, preparationTime, ingredients);
                this.recipes.add(recipe);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void listRecipes() {
        System.out.println("Recipes:");
        this.recipes.forEach(System.out::println);
    }

    public List<Recipe> findByName(String name) {
        String lowercaseName = name.toLowerCase(); // Convert search string to lowercase
        return this.recipes.stream()
                .filter(r -> r.getName().toLowerCase().contains(lowercaseName))
                .collect(Collectors.toList());
    }

    public void findByCookingTime(int time) {
        System.out.println("Recipes:");
        ArrayList<Recipe> searchResult = new ArrayList<>();
        for (Recipe recipe : this.recipes) {
            if (recipe.getPreparationTime() <= time) {
                searchResult.add(recipe);
            }
        }
        searchResult.forEach(System.out::println);
    }

    public void findByIngredient(String ingredient) {
        System.out.println("Recipes:");
        ArrayList<Recipe> searchResult = new ArrayList<>();
        for (Recipe recipe : this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                searchResult.add(recipe);
            }
        }
        searchResult.forEach(System.out::println);
    }
}
