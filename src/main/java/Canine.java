public abstract class Canine extends Animal{
    private String typeOfEars;

    public Canine(String typeOfEars,String name){
        super(name);
        this.typeOfEars=typeOfEars;
    }

    public String getTypeOfEars() {
        return typeOfEars;
    }

    public void setTypeOfEars(String typeOfEars) {
        this.typeOfEars = typeOfEars;
    }



}
