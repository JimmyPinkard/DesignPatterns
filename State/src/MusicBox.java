import java.util.List;

public class MusicBox {
    private State state;
    private final State englishState;
    private final State frenchState;
    private final State spanishState;

    public MusicBox() {
        this.englishState = new EnglishState(this);
        this.frenchState = new FrenchState(this);
        this.spanishState = new SpanishState(this);
        setState(englishState);
    }

    public void pressStarButton() {
        state.pressStarButton();
    }

    public void pressHappyButton() {
        state.pressHappyButton();
    }
    public void pressEnglishButton() {
        state.pressEnglishButton();
    }
    public void pressFrenchButton() {
        state.pressFrenchButton();
    }
    public void pressSpanishButton() {
        state.pressSpanishButton();
    }

    public void setState(final State state) {
        this.state = state;
    }

    public State getEnglishState() {
        return englishState;
    }

    public State getFrenchState() {
        return frenchState;
    }

    public State getSpanishState() {
        return spanishState;
    }

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
