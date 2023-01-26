public class Someone extends Human {
    private String out = "";

    public Someone(String name, String characteristic) {
        super(name, characteristic);
    }

    @Override
    public void action1() {
        out += "если бы " + name + " ему об этом напомнил. ";
        }
    @Override
    public void describe(){
        System.out.print(out);
        out = "";
    }
}
