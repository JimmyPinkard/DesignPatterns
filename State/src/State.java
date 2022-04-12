public abstract class State {
    protected MusicBox box;

    /**
     * State for Star Button
     */
    public abstract void pressStarButton();
    /**
     * State for Happy Button
     */
    public abstract void pressHappyButton();
    /**
     * State for English Button
     */
    public void pressEnglishButton() {
        box.setState(box.getEnglishState());
    }
    /**
     * State for French Button
     */
    public void pressFrenchButton() {
        box.setState(box.getFrenchState());
    }
    /**
     * State for Spanish Button
     */
    public void pressSpanishButton() {
        box.setState(box.getSpanishState());
    }
}
