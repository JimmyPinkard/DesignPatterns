import java.util.List;

public class MusicBox {
    private State state;
    private final State englishState;
    private final State frenchState;
    private final State spanishState;

    /**
     * Constructor
     */
    public MusicBox() {
        this.englishState = new EnglishState(this);
        this.frenchState = new FrenchState(this);
        this.spanishState = new SpanishState(this);
        setState(englishState);
    }

    /**
     * plays twinkle twinkle little star
     */
    public void pressStarButton() {
        state.pressStarButton();
    }

    /**
     * plays if you're happy and you know it
     */
    public void pressHappyButton() {
        state.pressHappyButton();
    }

    /**
     * changes to english
     */
    public void pressEnglishButton() {
        state.pressEnglishButton();
    }

    /**
     * changes to french
     */
    public void pressFrenchButton() {
        state.pressFrenchButton();
    }

    /**
     * changes to spanish
     */
    public void pressSpanishButton() {
        state.pressSpanishButton();
    }

    /**
     *
     * @param state
     */
    public void setState(final State state) {
        this.state = state;
    }

    /**
     *
     * @return
     */
    public State getEnglishState() {
        return englishState;
    }

    /**
    public State getFrenchState() {
        return frenchState;
    }

    /**
     *
     * @return
     */
    public State getSpanishState() {
        return spanishState;
    }

    /**
     * Plays the chosen song
     * @param songName
     * @param lyrics
     */
    public void playSong(final String songName, final List<String> lyrics) {
        System.out.printf("Playing: %s\n", songName);
        try {
            for(String line : lyrics) {
                System.out.println(line);
                Thread.sleep(3000);
            }
        }
        catch (InterruptedException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
}
