/**
 * Interface to iterate through a collection such as an array
 */
public interface Iterator
{
    /**
     * returns true if there are more exercise to iterate over
     * @return
     */
    boolean hasNext();

    /**
     * iterates to and returns the next element in the array
     * @return the next element in the array
     */
    Object next();
}