public abstract class Feline extends Animal {
    private boolean hasClaws;

    public Feline(boolean hasClaws,String name){
        super(name);
        this.hasClaws=hasClaws;
    }

    public boolean isHasClaws() {
        return hasClaws;
    }

    public void setHasClaws(boolean hasClaws) {
        this.hasClaws = hasClaws;
    }


}
