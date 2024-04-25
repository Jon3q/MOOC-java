import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

public class ExerciseManagementTest {

    private ExerciseManagement management;

// private Exercise completedExercises;

    @Before

    public void initialize(){

        management = new ExerciseManagement();

// this.completedExercises = new Exercise("new exercise");

    }

    @Test

    public void exerciseListEmptyAtTheBeginning(){

// ExerciseManagement management = new ExerciseManagement();

        assertEquals(0,management.exerciseList().size());

    }

    @Test
    public void addingExerciseGrowsListByOne() {

// ExerciseManagement management = new ExerciseManagement();

        management.add("this test");

        assertEquals(1, management.exerciseList().size());

    }

    @Test
    public void addedExerciseIsInList() {

// ExerciseManagement management = new ExerciseManagement();

        management.add("this test");

        assertTrue( management.exerciseList().contains("this test"));

    }

    @Test

    public void exerciseCanBeMarkedAsCompleted() {

        management.add("this test");

        management.markAsCompleted("this test");

        assertTrue(management.isCompleted("this test"));

    }

    @Test

    public void ifNotMarkedCompletedIsNotCompleted() {

        management.add("this test");

        management.markAsCompleted("this test");

        assertFalse(management.isCompleted("not this test"));

    }

}
