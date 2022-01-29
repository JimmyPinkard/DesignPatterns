import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class for Student Government Poll
 */
public class StudentGovPoll implements Subject {

    private String school;
    private ArrayList<Observer> observers;
    private HashMap<String, Integer> votes;
    private int numUpdates;

    /**
     * Constructor for StudentGovPoll
     * @param school
     */
    public StudentGovPoll(final String school) {
        this.school = school;
        this.observers = new ArrayList<>();
        this.observers.add(new TallyDisplay(this));
        this.observers.add(new PercentageDisplay(this));
        this.votes = new HashMap<>();
        this.numUpdates = 0;
    }

    /**
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        // TODO Auto-generated method stub
        this.observers.add(observer);
    }

    /**
     *
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    /**
     *
     * @param observer
     */
    @Override
    public void notifyObserver(Observer observer) {
        observer.update(this.votes);
    }

    /**
     *
     * @param president
     */
    public void addCandidate(final String president) {
        this.votes.put(president, 0);
    }

    /**
     * @param president
     * @param num
     */
    public void enterVotes(final String president, final int num) {
        this.votes.merge(president, num, Integer::sum);
        ++numUpdates;
        if(numUpdates % 4 == 0) {
            for(final Observer observer : observers) {
                System.out.println();
                notifyObserver(observer);
            }
        }
    }

    /**
     * @return school
     */
    public String getSchool() {
        return school;
    }
    
}