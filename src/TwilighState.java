public enum TwilighState {
    CLEAR("ясные"),
    TRANSPARENT("прозрачные"),
    BLUE("синие");

    private final String state;

    TwilighState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }
    @Override
    public String toString() {
        return state;
    }
}
