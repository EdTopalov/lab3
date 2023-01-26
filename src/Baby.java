public class Baby extends Human implements Totally , FlyWith {
    protected static String out = "";

    private Heart heart = new Heart("сердце ");

    public void ahceHeart(){
        heart.ache();
    }

   public Baby(String name, String characteristic){
      super(name ,characteristic);

    }
    
    public void action1() {
        out += "Он привык " ;
    }

    public void action2() {
        out += "и искренне удивился бы, " ;
    }
    public void wrapping(Human human){
        out += ", когда он, обхватив " + human.getName() + "а руками за шею, ";
    }

    public void rapidlyUpwards(){
        out += " стремительно взлетал ввысь, прям к домику на крыше.";
    }
    public void forgot(){
        out += " забыл ";
    }
    public void notScared(){
        out += "совсем не боялся, ";
    }

    public static class Heart {

        protected String name = "";
        public Heart(String name) {
            this.name = name;
        }
        public void ache(){
            out += "и даже " + name +  "у него не ёкало";
        }
    }
    @Override
    public void flyWith(){
        out += "летать с Карлсоном ";
    }
    @Override
    public void totally(){
        out += " но об этом " + name + " совсем ";
    }
    @Override
    public void describe(){
        System.out.print(out);
    out = "";
    }

}
