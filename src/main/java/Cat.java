public class Cat extends Feline implements Pets {
    private String breedType;

    public Cat( String breedType, boolean hasClaws, String name) {
        super(hasClaws,name);
        this.breedType=breedType;
    }

    public void Bite() {
        System.out.println("That Hurt u B!+@#");
    }

    public void greet() {
        System.out.println("Rub Face");
    }

    public void giveKisses() {
        System.out.println("Spicy Lick");
    }

    public String getBreedType() {
        return breedType;
    }

    public void setBreedType(String breedType) {
        this.breedType = breedType;
    }

    @Override
    public void speak() {
        System.out.println("Let There Be Fire");

    }
}
