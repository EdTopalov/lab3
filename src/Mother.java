public class Mother extends Human {
    private String out = "";

    public Mother(String name, String characteristic){
        super(name, characteristic);
    }
    @Override
    public void action1(){
        out += "Правда, " + this.name + " не разрешала ";
    }
    @Override
    public void describe(){
        System.out.print(out);
        out = "";
    }
}
