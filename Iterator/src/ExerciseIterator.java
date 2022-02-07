/**
 * Iterator for Exercises
 */
public class ExerciseIterator implements Iterator
{
    private final Exercise[] exercises;
    private int position;

    /**
     * Constructor for ExerciseIterator
     * @param exercises array of exercises
     */
    public ExerciseIterator(final Exercise[] exercises)
    {
        this.position = -1;
        this.exercises = exercises;
    }

    /**
     * returns true if there are more exercise to iterate over
     * @return a boolean
     */
    @Override
    public boolean hasNext() {
        return exercises.length != position + 1 && exercises[position + 1] != null;
    }

    /**
     * iterates to and returns the next element in the array
     * @return the next element in the array
     */
    @Override
    public Exercise next() {
        return hasNext() ? exercises[++position] : null;
    }
}