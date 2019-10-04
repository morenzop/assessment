public class Tiger extends Feline {

    private String stripes;

    public Tiger(boolean hasClaws, String stripes,String name) {
        super(hasClaws, name);
        this.stripes=stripes;
    }

    public String getStripes() {
        return stripes;
    }

    public void setStripes(String stripes) {
        this.stripes = stripes;
    }

    public void Bite() {
        System.out.println("R.I.P.");
    }

    public void speak() {
        System.out.println("Growl");

    }
}
