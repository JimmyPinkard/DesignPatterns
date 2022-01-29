import java.util.ArrayList;

/**
 * Bubble sort SortBehaviour
 */
public class BubbleSort implements SortBehavior {
    /**
     * Bubble sort implementation
     * @param data sorts the data using bubble sort
     * @return the sorted list
     */
    @Override
    public ArrayList<String> sort(final ArrayList<String> data) {
        final ArrayList<String> copy = new ArrayList<>(data);
        boolean hasSwapped;
        do {
            hasSwapped = false;
            for(int i = 0; i < copy.size() - 1; ++i) {
                final String temp = copy.get(i);
                if(copy.get(i).compareTo(copy.get(i + 1)) > 0) {
                    copy.set(i, copy.get(i + 1));
                    copy.set(i + 1, temp);
                    hasSwapped = true;
                }
            }
        }
        while(hasSwapped);
        return copy;
    }
}