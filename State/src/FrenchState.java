import java.util.ArrayList;
import java.util.List;

public class FrenchState extends State {

    public FrenchState(final MusicBox box) {
        this.box = box;
    }

    /**
     * State for Star Button
     */
    @Override
    public void pressStarButton() {
        final List<String> lyrics = new ArrayList<>();
        lyrics.add("Si tu as d' la joie au coeur, Frappe des mains");
        lyrics.add("Si tu as d' la joie au coeur, Frappe des mains");
        lyrics.add("Si tu as d' la joie au coeur, Frappe des mains");
        lyrics.add("Si tu as d' la joie au coeur, Frappe des mains");
        box.playSong("Tu as D' la Joie au Coeur", lyrics);
    }

    /**
     * State for Happy Button
     */
    @Override
    public void pressHappyButton() {
        final java.util.List<String> lyrics = new java.util.ArrayList<>();
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Frappe des mains");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Frappe des mains");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Frappe des mains.");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Frappe du pied");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Frappe du pied");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Frappe du pied.");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Claque la langue");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Claque la langue");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Claque la langue");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Dis merci – merci");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Dis merci – merci");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Si tu as d' la joie au cœur");
        lyrics.add("Dis merci – merci.");
        box.playSong("Si tu as d' la joie au cœur", lyrics);
    }
}
