import java.util.ArrayList;

/**
 * Insertion sort SortBehavior
 */
public class InsertionSort implements SortBehavior {
    /**
     * Insertion sort algorithm
     * @param data a list to sort
     * @return a new list that's been sorted
     */
    @Override
    public ArrayList<String> sort(final ArrayList<String> data) {
        final ArrayList<String> list = new ArrayList<>();
        while(data.size() > 0) {
            String insert = data.get(0);
            int index = 0;
            for(int j = 1; j < data.size(); ++j) {
                final String temp = data.get(j);
                if(insert.compareTo(temp) > 0) {
                    index = j;
                    insert = temp;
                }
            }
            list.add(insert);
            data.remove(index);
        }
        return list;
    }
}