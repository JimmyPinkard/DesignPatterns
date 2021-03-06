import java.util.HashMap;
import java.util.Map;

/**
 * Displays as a percentage
 */
public class PercentageDisplay implements Observer {

    private final Subject subject;
    private final HashMap<String, Integer> votes;
    private int numVotes;

    /**
     *
     * @param subject
     */
    public PercentageDisplay(final Subject subject) {
        this.subject = subject;
        this.votes = new HashMap<>();
    }

    /**
     *
     * @param votes
     */
    @Override
    public void update(HashMap<String, Integer> votes) {
        for(final Map.Entry<String, Integer> entry : votes.entrySet()) {
            this.numVotes += entry.getValue();
            this.votes.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        display();
    }

    /**
     *
     */
    private void display() {
        System.out.println("Current Percent of Votes:");
        for(final Map.Entry<String, Integer> entry : this.votes.entrySet()) {
            final String percentage = Double.toString(Math.round(entry.getValue().doubleValue() / numVotes * 1000) / 10.0);
            System.out.printf("%s: %s%%\n", entry.getKey(), percentage);
        }
    }    
}