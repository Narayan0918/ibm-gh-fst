package ibm.fst;

interface BicycleParts{
    public int tyres =2;
    public int maxSpeed = 30;
}

interface BicycleOperations{
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}

class Bicycle implements BicycleParts, BicycleOperations{
    public int gears;
    public int currentSpeed;

    public Bicycle(int gears,int currentSpeed){
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void applyBrake(int decrement) {
            currentSpeed -= decrement;
            System.out.println("Current speed =>"+currentSpeed);
    }
        
    @Override
    public void speedUp(int increment) {
        currentSpeed += increment;
        System.out.println("Current speed =>"+currentSpeed);
    }

    public String bicycleDesc(){
        return ("No of gears are "+gears+"\nSpeed of bicycle is "+maxSpeed);
    }

}

class MountainBike extends Bicycle{
    public int seatHeight;

    public MountainBike(int gears,int currentSpeed, int startHeight){
        super(gears, currentSpeed);
        this.seatHeight = startHeight;
    }

    public void setHeight(int newValue){
        seatHeight = newValue;
    }

    @Override
    public String bicycleDesc(){
        return (super.bicycleDesc()+"\nSeat height is => "+seatHeight);
    }

}


public class Activity7 {
    public static void main(String[] args) {
        MountainBike mtb = new MountainBike(3,0,25);
            System.out.println((mtb.bicycleDesc()));
            mtb.speedUp(20);
            mtb.applyBrake(5);
    }
}
