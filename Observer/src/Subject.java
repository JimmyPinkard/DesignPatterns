/**
 * Subject of a Poll that Observers can follow
 */
public interface Subject {
    /**
     * Adds observer to a Poll
     * @param observer
     */
    @Deprecated
    void registerObserver(final Observer observer);
    /**
     * Removes observer to a Poll
     * @param observer
     * @deprecated
     */
    @Deprecated
    void removeObserver(final Observer observer);
    /**
     * Prints out the updated result to the observer
     * @param observer
     * @deprecated
     */
    void notifyObserver(final Observer observer);
}
