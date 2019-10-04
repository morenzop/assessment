public class Wolf extends Canine {
    private String furColor;

    public Wolf(String typeOfEars, String furColor, String name) {
        super(typeOfEars,name);
        this.furColor=furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void Bite() {
        System.out.println("R.I.P.");
    }

    @Override
    public void speak() {
        System.out.println("Howl");

    }
}
