import java.util.ArrayList;

public class BubbleSort implements SortBehavior
{
    @Override
    public ArrayList<String> sort(final ArrayList<String> data)
    {
        ArrayList<String> list = new ArrayList<>(data);
        boolean hasSwapped;
        do
        {
            hasSwapped = false;
            for(int i = 0; i < list.size() - 1; ++i)
            {
                final String temp = list.get(i);
                if(list.get(i).compareTo(list.get(i + 1)) > 0)
                {
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                    hasSwapped = true;
                }
            }
        }
        while(hasSwapped);
        return list;
    }
}
