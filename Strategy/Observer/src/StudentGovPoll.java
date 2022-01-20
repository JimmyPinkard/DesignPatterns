import java.util.ArrayList;
import java.util.HashMap;

public class StudentGovPoll implements Subject {

    private String school;
    private ArrayList<Observer> observers;
    private HashMap<String, Integer> votes;
    private int numUpdates;

    public StudentGovPoll(final String school) {
        this.school = school;
        this.observers = new ArrayList<>();
        this.observers.add(new TallyDisplay(this));
        this.observers.add(new PercentageDisplay(this));
        this.votes = new HashMap<>();
        this.numUpdates = 0;
    }

    @Override
    public void registerObserver(Observer observer) {
        // TODO Auto-generated method stub
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        // TODO Auto-generated method stub
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver(Observer observer) {
        // TODO Auto-generated method stub
        observer.update(this.votes);
    }

    public void addCandidate(final String president) {
        this.votes.put(president, 0);
    }

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

    public String getSchool() {
        return school;
    }
    
}