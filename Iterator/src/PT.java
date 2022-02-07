import java.util.ArrayList;
import java.util.Arrays;

public class PT
{
    private final String firstName;
    private final String lastName;
    private final String bio;
    private Exercise[] exercises;

    /**
     * Instantiates Personal Trainer
     * @param firstName
     * @param lastName
     * @param bio
     */
    public PT(final String firstName, final String lastName, final String bio)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;
        this.exercises = new Exercise[2];
    }

    /**
     * Adds a new exercise for the personal trainer
     * @param title
     * @param muscleGroups
     * @param directions
     */
    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions)
    {
        if(isFull(this.exercises))
        {
            this.exercises = growArray(exercises);
        }
        int i = 0;
        while(exercises[i] != null)
        {
            ++i;
        }
        exercises[i] = new Exercise(title, muscleGroups, directions);
    }

    /**
     * Instantiates ExerciseIterator
     * @return a new instance of ExerciseIterator
     */
    public ExerciseIterator createIterator()
    {
        return new ExerciseIterator(exercises);
    }

    //Getters

    /**
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return bio
     */
    public String getBio() {
        return bio;
    }

    /**
     * @return display of Trainer's info
     */
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(firstName).append(' ').append(lastName).append('\n').append(bio).append("\n\n");
        return builder.toString();
    }

    //Utility functions

    /**
     * Doubles the size of the array and copies data
     * @param exercises
     * @return
     */
    private Exercise[] growArray(final Exercise[] exercises)
    {
        Exercise[] arr = new Exercise[exercises.length * 2];
        for(int i = 0; i < exercises.length && exercises[i] != null; ++i)
        {
            arr[i] = exercises[i];
        }
        return arr;
    }

    /**
     * Utility function to check if the array is full
     * @param objects
     * @return is the array full
     */
    private boolean isFull(final Object[] objects)
    {
        final int length = objects.length;
        if(objects[length - 1] != null)
        {
            return true;
        }
        for (Object object : objects)
        {
            if (object == null)
            {
                return false;
            }
        }
        return true;
    }
}
