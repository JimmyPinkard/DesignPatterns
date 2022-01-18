import java.util.HashMap;

public class TallyDisplay implements Observer {

    private Subject subject;
    private HashMap<String, Integer> votes;

    public TallyDisplay(final Subject subject) {
        this.subject = subject;
        this.votes = new HashMap<>();
    }

    @Override
    public void update(HashMap<String, Integer> votes) {
        // TODO Auto-generated method stub
        this.votes.putAll(votes);
    }

    public void display() {
        //TODO place holder
    }    
}
