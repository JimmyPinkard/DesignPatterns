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
        ++numUpdates;
    }

    public void addCandidate(String president) {
        this.votes.put(president, 0);
    }

    public void enterVotes(String president, int num) {
        this.votes.put(president, num);
    }

    public String getSchool() {
        return school;
    }
    
}
