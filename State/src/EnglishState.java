import java.util.ArrayList;
import java.util.List;

public class EnglishState extends State {

    public EnglishState(final MusicBox box) {
        this.box = box;
    }

    /**
     * State for Star Button
     */
    @Override
    public void pressStarButton() {
        final List<String> lyrics = new ArrayList<>();
        lyrics.add("Twinkle twinkle little star");
        lyrics.add("How I wonder what you are");
        lyrics.add("Up above the world so high");
        lyrics.add("Like a dimond in the sky");
        lyrics.add("Twinkle twinkle little star");
        lyrics.add("How I wonder what you are");
        box.playSong("Twinkle Twinkle Little Star", lyrics);
    }

    /**
     * State for Happy Button
     */
    @Override
    public void pressHappyButton() {
        final java.util.List<String> lyrics = new java.util.ArrayList<>();
        lyrics.add("If you're happy and you know it clap your hands");
        lyrics.add("If you're happy and you know it clap your hands");
        lyrics.add("If you're happy and you know it");
        lyrics.add("And you really want to show it");
        lyrics.add("If you're happy and you know it clap your hands");
        lyrics.add("If you're happy and you know it stomp your feet");
        lyrics.add("If you're happy and you know it stomp your feet");
        lyrics.add("If you're happy and you know it");
        lyrics.add("And you really want to show it");
        lyrics.add("If you're happy and you know it stomp your feet");
        lyrics.add("If you're happy and you know it nod your head");
        lyrics.add("If you're happy and you know it nod your head");
        lyrics.add("If you're happy and you know it");
        lyrics.add("And you really want to show it");
        lyrics.add("If you're happy and you know it nod your head");
        lyrics.add("If you're happy and you know it do all three");
        lyrics.add("If you're happy and you know it do all three");
        lyrics.add("If you're happy and you know it");
        lyrics.add("And you really want to show it");
        lyrics.add("If you're happy and you know it do all three");
        box.playSong("If You're Happy and You Know It", lyrics);
    }
}
