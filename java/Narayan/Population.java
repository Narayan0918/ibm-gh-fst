package ibm.fst;

class Human {

    private static int humanCount = 0;

    public Human() {
        humanCount++;
    }

    public static int getHumanCount() {
        return humanCount;
    }

    public void walking() {
        System.out.println("Walking");
    }

    public void talking() {
        System.out.println("Talking");

    }
}

class Boy extends Human {}

class Girl extends Human {}

class Robot {

    private static int robotCount = 0;

    public Robot() {
        robotCount++;
    }

    public static int getRobotCount() {
        return robotCount;
    }

    public void walking() {
        System.out.println("Walking");

    }

    public void talking() {
        System.out.println("Talking");

    }

}

public class Population {

    public static void main(String[] args) {
        Boy b1 = new Boy();
        Boy b2 = new Boy();
        Boy b3 = new Boy();
        Girl g1 = new Girl();
        Girl g2 = new Girl();
        Girl g3 = new Girl();
        Robot r1 = new Robot();
        Robot r2 = new Robot();
        Robot r3 = new Robot();

        System.out.println("Human population: " + Human.getHumanCount());
        System.out.println("Robot population: " + Robot.getRobotCount());
    }
}
