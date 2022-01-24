/**
 * Interface for followers of a poll
 */
public interface Observer
{
    /**
     * Updates that instance of the Observer
     * @param votes
     */
    void update(final java.util.HashMap<String, Integer> votes);
}