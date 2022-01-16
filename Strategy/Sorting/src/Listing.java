import java.util.ArrayList;

public class Listing
{
    private final String title;
    private ArrayList<String> items;
    private SortBehavior sortBehavior;

    public Listing(final String title)
    {
        this.title = title;
        this.items = new java.util.ArrayList<>();
        setSortBehavior(new BubbleSort());
    }

    public void add(final String item)
    {
        items.add(item);
    }

    @Deprecated
    public void remove(final String item)
    {
        for(int i = 0; i < items.size(); ++i)
        {
            if(items.get(i).equals(item))
            {
                items.remove(i);
                return;
            }
        }
    }

    public String getTitle()
    {
        return title;
    }

    public void setSortBehavior(final SortBehavior sortBehaviour)
    {
        if(sortBehaviour == null)
        {
            this.sortBehavior = new BubbleSort();
            return;
        }
        this.sortBehavior = sortBehaviour;
    }

    public ArrayList<String> getSortedList()
    {
        return (items = sortBehavior.sort(items));
    }

    @Deprecated
    public ArrayList<String> getUnSortedList()
    {
        return items;
    }
}
