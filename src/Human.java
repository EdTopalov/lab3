public abstract class Human {
    protected final String name;
    protected final String characteristic;

    public Human(String name, String characteristic) {
        this.characteristic = characteristic;
        this.name = name;
    }

    public void action1(){};

    public void action2(){};

    public String getName() {
        return name;
    }
    public String getCharacteristic() {
        return characteristic;
    }
    public abstract void describe();
}


