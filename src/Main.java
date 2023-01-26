public class Main {
    public static void main(String[] args) throws NotExistData{
        Mother mother = new Mother("Мама", "заботливая");
        //Someone someone = new Someone("кто-нибудь", "кто-то");
        Human someone = new Human("кто-нибудь", "кто-то") {
            private String out="";
            @Override
            public void action1() {
                out += "если бы " + name + " ему об этом напомнил. ";
            }
            @Override
            public void describe(){
                System.out.print(out);
                out = "";
            }
        };
        Karlson karlson = new Karlson("Карлсон" , "беззаботный");
        Baby baby = new Baby("Малыш", "забывчивый");
        Stockholm stockholm = new Stockholm("Стокгольм");
        Stockholm.Evenings july = new Stockholm.Evenings("Июльский" , 10);
        Stockholm.Evenings june = new Stockholm.Evenings("Июньских" , 25);
        Stockholm.Evenings june2 = new Stockholm.Evenings("Июньских" , 25);
        Stockholm.Evenings august = new Stockholm.Evenings("Августовский" , 10);
        World world = new World("мир");
        World.City city = new World.City(" город и небо ");
        World.Sky sky = new World.Sky(" небо ");
        Baby.Heart heart = new Baby.Heart(" сердце ");
        mother.action1(); //Мама не разрешала
        mother.describe();
        karlson.fly(karlson); //летать с Карлсоном на крышу
        karlson.describe();
        baby.totally(); // но об этом Малыш совсем
        baby.describe();
        baby.forgot(); //забыл
        baby.describe();
        baby.action2(); //и искренне удивился бы,
        baby.describe();
        someone.action1(); //если бы кто-нибудь ему об этом напомнил.
        someone.describe();
        System.out.println("");
        baby.action1(); //Он привык
        baby.describe();
        baby.flyWith(); //летать с Карлсоном
        baby.describe();
        baby.notScared(); //и совсем не боялся,
        baby.describe();
        baby.ahceHeart(); //не ёкало
        baby.describe();
        baby.wrapping(karlson); //когда он, обхватив Карлсона руками за шею,
        baby.describe();
        baby.rapidlyUpwards(); //стремительно взлетал ввысь,прямо к домику на крыше
        baby.describe();
        System.out.println("");
        if(Math.random() < 0.3)june.compareAll(august , july, june2);
        else june.compareAll(august , july); //Таких Июньских вечеров, не бывает
        stockholm.describe();
        stockholm.named(); //Стокгольм
        stockholm.describe();
        sky.named(); //небо
        world.describe();
        sky.shine(); //не светится этим особым светом
        world.describe();
        System.out.println("");
        city.named(); //что город и небо ,
        world.describe();
        sky.reflected(); //отраженные в блеклых водах залива,
        world.describe();
        city.seem(); //кажутся совсем сказочными.
        world.describe();
    }

}