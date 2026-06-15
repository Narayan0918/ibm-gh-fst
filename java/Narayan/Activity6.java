package ibm.fst;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {

    private final List<String> passengers;
    private final int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onBoard(String passengerName) {
        if (passengers.size() <= maxPassengers) {
            passengers.add(passengerName);
        } else {
            System.out.println("Plane is full");
        }
    }

    public void takeOff() {
        Date current = new Date();
        lastTimeTookOf = current;
        System.out.println("Last time tookOff => " + lastTimeTookOf);
    }

    public void Land() {
        Date now = new Date();
        this.lastTimeLanded = now;
        this.passengers.clear();
        System.out.println("Land");
    }

    public void getLastTimeLanded() {
        System.out.println("Last time Landed => " + lastTimeLanded);
    }

    public void getPassengers() {
        System.out.println("Passengers => " + passengers);
    }

}

public class Activity6 {

    public static void main(String[] args) {
        Plane plane = new Plane(10);
        plane.onBoard("Shruthi");
        plane.onBoard("Narayan");
        plane.onBoard("Sandhya");
        plane.onBoard("Sarang");
        plane.onBoard("Manish");
        plane.onBoard("Arjun");
        plane.onBoard("Srinidhi");
        plane.onBoard("Jerome");
        plane.onBoard("Avik");
        plane.onBoard("Yash");
        plane.takeOff();
        plane.getPassengers();
        try {
            Thread.sleep(5000); // sleep for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        plane.Land();
        plane.getLastTimeLanded();
    }
}
