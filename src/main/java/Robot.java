public abstract class Robot {
    private boolean madeOfMetal;

    public Robot(boolean madeOfMetal){
        this.madeOfMetal=madeOfMetal;
    }
    public abstract String doTheRobot();

    public boolean isMadeOfMetal() {
        return madeOfMetal;
    }

    public void setMadeOfMetal(boolean madeOfMetal) {
        this.madeOfMetal = madeOfMetal;
    }
}
