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
        boolean hasSwapped;
        do {
            hasSwapped = false;
            for(int i = 0; i < data.size() - 1; ++i) {
                final String temp = data.get(i);
                if(data.get(i).compareTo(data.get(i + 1)) > 0) {
                    data.set(i, data.get(i + 1));
                    data.set(i + 1, temp);
                    hasSwapped = true;
                }
            }
        }
        while(hasSwapped);
        return data;
    }
}