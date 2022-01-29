import java.util.ArrayList;

/**
 * A List wrapper class
 */
public class Listing {
    private final String title;
    private ArrayList<String> items;
    private SortBehavior sortBehavior;

    /**
     * Instantiates a new Listing object
     * @param title The title of the list
     */
    public Listing(final String title) {
        this.title = title;
        this.items = new java.util.ArrayList<>();
        setSortBehavior(new BubbleSort());
    }

    /**
     * Adds an element to the list. Checks to see if it's null, empty, or already exists before adding.
     * @param item The item to add to the list
     */
    public void add(final String item) {
        if(item == null || item.isEmpty()) {
            return;
        }
        items.add(item);
    }

    /**
     * Removes an element from a list
     * @param item The name of the item to be deleted
     * @deprecated never called
     */
    @Deprecated
    public void remove(final String item) {
        for(int i = 0; i < items.size(); ++i) {
            if(items.get(i).equals(item)) {
                items.remove(i);
                return;
            }
        }
    }

    /**
     * Gets the title of a list
     * @return The title of the List
     */
    public String getTitle() {
        return title;
    }

    /**
     * Changes sortBehavior to a different algorithm after checking if it's null. Default is bubbleSort.
     * @param sortBehaviour The sorting algorithm to be used
     */
    public void setSortBehavior(final SortBehavior sortBehaviour) {
        if(sortBehaviour == null) {
            this.sortBehavior = new BubbleSort();
            return;
        }
        this.sortBehavior = sortBehaviour;
    }

    /**
     * Sorts the list and returns it
     * @return the list after being sorted
     */
    public ArrayList<String> getSortedList() {
        items = sortBehavior.sort(items);
        return items;
    }

    /**
     * Returns the list of elements as it is
     * @deprecated It's never called
     * @return the list
     */
    @Deprecated
    public ArrayList<String> getUnSortedList() {
        return items;
    }
}
