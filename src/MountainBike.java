public class MountainBike extends Bicycle{
    //podtrida - subclass
    //atribut - field
    public int seatHeight;

    public MountainBike(int seatHeight, int startCadence,
                        int startSpeed, String startColor,
                        int startGear) {
        super(startCadence,startSpeed,startGear,startColor);
        this.seatHeight = seatHeight;
    }

    public void setSeatHeight(int newSeatHeight) {
        this.seatHeight = newSeatHeight;
    }
}
