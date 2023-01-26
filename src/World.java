

public class World extends Places {

    protected static String out = "";

    public World(String theName) {
        super(theName);
    }


    public static class Sky {
        private String theName;
        public Sky(String theName) {
            this.theName = theName;
        }

        public void named(){
            out += "Нигде в мире " + theName;
        }
        public void shine(){
            out += " не светится этим особым светом, ";
        }
        public void reflected(){
            out += " отраженные в блеклых водах залива, ";
        }
    }

    public static class City {

        protected String theName;
        public City(String theName){
            this.theName = theName;
        }
        public void named(){
            out += "нигде сумерки не бывают такими " + TwilighState.CLEAR.getState() + ", такими " + TwilighState.TRANSPARENT.getState() + ", такими " + TwilighState.BLUE.getState() + ", что" + theName + ",";
        }
        public void seem(){
            out += " кажутся совсем сказочными. ";
        }

    }

    @Override
    public void named(){
        out += " Никогда в " + getTheName() + "e";
    }
    @Override
    public void describe(){
        System.out.print(out);
        out = "";
    }
}