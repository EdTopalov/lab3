public class Karlson extends Human implements Fly {
    private String out = "";
    private int mana = 10;
    public Karlson(String name, String characteristic){
        super(name , characteristic);
    }

    @Override
    public void fly(Human human)  {
        try{
            mana -= 13*Math.random();
            checkMana();
            class Propeller{
                private String out="";
                public void spin(){
                out += "летать";
            }
            @Override
                public String toString(){
                    return out;
            }
            }
            Propeller prop = new Propeller();
            prop.spin();
            out +=  prop + " с " + human.getName() + "ом на крышу," ;

        }catch (NotEnoughMana ex){
            ex.printStackTrace();
            System.exit(1);
        }
    }

    @Override
    public void describe(){
        System.out.print(out);
        out = "";
    }

    public void checkMana() throws NotEnoughMana {
        if (mana < 5 ) throw new NotEnoughMana("недостаточно варенья для взлета");
    }

    @Override
    public String toString(){
       return "Карлсон с маной " + mana;
    }
}
