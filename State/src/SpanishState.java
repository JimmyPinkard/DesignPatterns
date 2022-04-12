import java.util.ArrayList;
import java.util.List;

public class SpanishState extends State {
    public SpanishState(final MusicBox box) {
        this.box = box;
    }

    /**
     * State for Star Button
     */
    @Override
    public void pressStarButton() {
        final List<String> lyrics = new ArrayList<>();
        lyrics.add("Estrellita, ¿dónde estás?");
        lyrics.add("Quiero verte cintilar");
        lyrics.add("En el cielo, sobre el mar.");
        lyrics.add("Un diamante de verdad.");
        lyrics.add("Estrellita, ¿dónde estás?");
        lyrics.add("Quiero verte cintilar.");
        box.playSong("Estrellita, ¿Dónde Estás?", lyrics);
    }

    /**
     * State for Happy Button
     */
    @Override
    public void pressHappyButton() {
        final java.util.List<String> lyrics = new java.util.ArrayList<>();
        lyrics.add("Si usted esta feliz Apaluda las fuerte.");
        lyrics.add("Clap, Clap.");
        lyrics.add("Si usted esta feliz Apaluda las fuerte.");
        lyrics.add("Clap, Clap.");
        lyrics.add("Si usted esta feliz");
        lyrics.add("En su cara se vera.");
        lyrics.add("Si usted esta feliz");
        lyrics.add("Apaluda las fuerte.");
        lyrics.add("Clap, Clap.");
        lyrics.add("Si usted esta feliz Dese un brazo.");
        lyrics.add("Hug yourself.");
        lyrics.add("Si usted esta feliz Dese un brazo.");
        lyrics.add("Hug yourself.");
        lyrics.add("Si usted esta feliz");
        lyrics.add("En su cara se vera.");
        lyrics.add("Si usted esta feliz");
        lyrics.add("Dese un brazo.");
        lyrics.add("Hug yourself.");
        lyrics.add("Bese a su cerebro...");
        lyrics.add("Meneese...");
        lyrics.add("Grite horrah...");
        lyrics.add("Hagalos todos...");
        box.playSong("Si usted esta feliz...", lyrics);
    }
}
