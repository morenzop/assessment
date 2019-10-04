public class RoboDog extends Robot implements Pets {

    private int numOfRobotLegs;

    public RoboDog( int numOfRobotLegs, boolean madeOfMetal) {
        super(madeOfMetal);
        this.numOfRobotLegs=numOfRobotLegs;
    }


   public String doTheRobot() {
        return "Robo-Sit";
    }

    public int getNumOfRobotLegs() {
        return numOfRobotLegs;
    }

    public void setNumOfRobotLegs(int numOfRobotLegs) {
        this.numOfRobotLegs = numOfRobotLegs;
    }


    public void greet() {
        System.out.println("Robo Tail Wag");
    }

    public void giveKisses() {
        System.out.println("Shock Lick");
    }
}
