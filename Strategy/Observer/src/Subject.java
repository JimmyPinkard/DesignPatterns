public interface Subject {
    public void registerObserver(final Observer observer);
    public void removeObserver(final Observer observer);
    public void notifyObserver(final Observer observer);
}
