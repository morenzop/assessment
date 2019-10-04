public class AssessmentTests {
    public static void main(String[] args) {
        RoboDog roboDog=new RoboDog(4,true);
        Hippo hippo=new Hippo(3000.0,"Moto Moto");
        Cat cat= new Cat("Calico", true,"Puskers");
        Lion lion=new Lion(true, "Brown","Scar");
        Tiger tiger=new Tiger(true, "Alot","Raul");
        Wolf wolf=new Wolf("Pointed", "Grey-Blue","Alpha");
        Dog dog=new Dog("Floppy", "Dachshund","DeathMonger");

        Animal[] animals= {hippo,cat, lion,tiger,wolf,dog};
        Pets[] pets= {roboDog,cat,dog};

       loopThatJawn(animals);


       loopPets(pets);
    }

    public static void loopThatJawn(Animal[] animals) {
        for (int x = 0; x < animals.length; x++) {
             animals[x].speak();
        }
    }
    public static void loopPets(Pets[] pets){
        for (int x = 0; x < pets.length; x++){
            pets[x].greet();
            pets[x].giveKisses();
        }
    }
}
