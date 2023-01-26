public abstract class Places {
    protected final String theName;

    public Places(String theName){
        this.theName = theName;
    }
    public String getTheName() {
        return theName;
    }
    public void named(){};
    public abstract void describe();
}
