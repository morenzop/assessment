public class Hippo extends Animal {
    private double weight;

    public Hippo(double weight,String name){
        super(name);
        this.weight=weight;
    }

    public void Bite() {
        System.out.println("That's gotta hurt");
    }

    @Override
    public void speak() {
        System.out.println("Big Boy Talk");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
