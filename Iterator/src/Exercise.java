import java.util.ArrayList;

/**
 * The class for an exercise
 */
public class Exercise
{
    private final String title;
    private ArrayList<String> targetMuscles;
    private ArrayList<String> directions;

    /**
     * Instantiates an Exercise with only a title
     * @param title
     */
    public Exercise(final String title)
    {
        this.title = title;
    }

    /**
     * Instantiates an Exercise with details
     * @param title
     * @param targetMuscles
     * @param directions
     */
    public Exercise(final String title, final ArrayList<String> targetMuscles, final ArrayList<String> directions)
    {
        this.title = title;
        this.targetMuscles = targetMuscles;
        this.directions = directions;
    }

    /**
     *add a target muscle
     * @param muscle to add
     */
    public void addTargetMuscle(final String muscle)
    {
        targetMuscles.add(muscle);
    }

    /**
     * remove a target muscles
     * @param muscle to remove
     */
    public void removeTargetMuscle(final String muscle)
    {
        targetMuscles.remove(muscle);
    }

    /**
     * string version of object
     * @return string version of object
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("... ").append(title).append(" ...\n").append("Muscles: ");
        for(final String muscle : targetMuscles)
        {
            builder.append(muscle).append(", ");
        }
        builder.delete(builder.lastIndexOf(","), builder.length()).append("\nExercises:\n");
        for(final String direction : directions)
        {
            builder.append("- ").append(direction).append("\n");
        }
        return builder.append('\n').toString();
    }
}