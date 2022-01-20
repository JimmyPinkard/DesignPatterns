import java.util.HashMap;
import java.util.Map;

public class TallyDisplay implements Observer {

    private final Subject subject;
    private final HashMap<String, Integer> votes;

    public TallyDisplay(final Subject subject) {
        this.subject = subject;
        this.votes = new HashMap<>();
    }

    @Override
    public void update(HashMap<String, Integer> votes) {
        for(final Map.Entry<String, Integer> entry : votes.entrySet()) {
            this.votes.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        display();
    }

    private void display() {
        //TODO place holder
        System.out.println("Current Tallies:");
        for(final Map.Entry<String, Integer> entry : this.votes.entrySet()) {
            System.out.printf("%s: %d\n", entry.getKey(), entry.getValue());
        }
    }    
}