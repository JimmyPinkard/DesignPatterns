import java.util.HashMap;

public class PercentageDisplay implements Observer {

    private Subject subject;
    private HashMap<String, Integer> votes;
    private int numVotes;

    public PercentageDisplay(final Subject subject) {
        this.subject = subject;
        this.votes = new HashMap<>();
    }

    @Override
    public void update(HashMap<String, Integer> votes) {
        // TODO Auto-generated method stub
        this.votes.putAll(votes);
        this.numVotes += votes.get(votes.keySet().toArray()[0]);
    }

    public void display() {
        //TODO place holder
    }    
}