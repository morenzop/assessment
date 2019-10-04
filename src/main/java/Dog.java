public class Dog extends Canine implements Pets {
    private String breedType;

    public Dog(String typeOfEars, String breedType,String name) {
        super(typeOfEars,name);
        this.breedType=breedType;
    }

    @Override
    public void speak() {
        System.out.println("Bark Bark Mother F~@%#&");

    }

    public void greet() {
        System.out.println("Tail Wag");
    }

    public void giveKisses() {
        System.out.println("Wet Licks");

    }

    public String getBreedType() {
        return breedType;
    }

    public void setBreedType(String breedType) {
        this.breedType = breedType;
    }

    public void Bite() {
        System.out.println("That Hurt");
    }
}
