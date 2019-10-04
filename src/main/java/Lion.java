public class Lion extends Feline {
    private String maneColor;

    public Lion(boolean hasClaws, String maneColor, String name) {
        super(hasClaws,name);
        this.maneColor=maneColor;
    }

    public String getManeColor() {
        return maneColor;
    }

    public void setManeColor(String maneColor) {
        this.maneColor = maneColor;
    }

    public void Bite() {
        System.out.println("R.I.P.");
    }
    @Override
    public void speak() {
        System.out.println("Roar");

    }
}
