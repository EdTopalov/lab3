public class Stockholm extends Places {
    protected static String out = "";

    public Stockholm(String theName){
        super(theName);
    }

    public static class Evenings {

        private int ind;
        private String month;

        public Evenings(String month , int ind){
            this.month = month;
            this.ind = ind;
        }



        public boolean compareAll(Evenings... evenings) throws  NotExistData{
            out += "Таких " + this.month + " вечеров, ";
            for (Evenings evening : evenings){
                if (this.equals(evening)){

                    throw new NotExistData("Несушествующая дата. Месяцы не могут совпадать");
                }
            }
                    out += "не бывает ";
            return false;
        }
        @Override
        public boolean equals(Object object){
            return this.hashCode() == object.hashCode();
        }
        @Override
        public int hashCode(){
            return this.month.hashCode()*this.ind;
        }
    }

    @Override
    public void named(){
        out += "как в " + getTheName() + "e нигде." ;
    }
    @Override
    public void describe(){
        System.out.print(out);
        out = "";
    }

}
