import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exercises;

//private ArrayList<String> completedexercise;

    public ExerciseManagement() {

        this.exercises = new ArrayList<>();

// this.completedexercise = new ArrayList<>();

    }

    public ArrayList<String> exerciseList(){

//public ArrayList<Exercise> exerciseList() {

        ArrayList<String> list = new ArrayList<>();

        for (int a =0; a< exercises.size();a++)

        {

            list.add(exercises.get(a).getName());

        }

        return list;

//return this.exercises;

    }

    public void add(String exercise) {

        this.exercises.add(new Exercise (exercise));

    }

    public void markAsCompleted(String exercise) {

// this.completedexercise.add(exercise);

        for (Exercise ex: exercises) {

            if (ex.getName().equals(exercise)) {

                ex.setCompleted(true);

            }

        }

    }

    public boolean isCompleted(String exercise) {

// return this.completedexercise.contains(exercise);

        for (Exercise ex: exercises) {

            if (ex.equals(exercise)) {

                return ex.isCompleted();

            }

        }

        return false;

    }

}
