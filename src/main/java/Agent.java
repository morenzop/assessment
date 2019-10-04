public class Agent extends Robot {
    private String armCannon;

    public Agent(String armCannon, boolean madeOfMetal){
        super(madeOfMetal);
        this.armCannon=armCannon;
    }
    public String doTheRobot() {
        return "Domo Arigato";
    }

    public String getArmCannon() {
        return armCannon;
    }

    public void setArmCannon(String armCannon) {
        this.armCannon = armCannon;
    }
}
