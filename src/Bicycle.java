public class Bicycle {
    // tri atributy - v AJ se jim rika fields
    public int speed;
    public int gear;
    public int cadence;
    public String color;

    //konstruktor
    public Bicycle(int speed, int gear, int cadence, String color) {
        this.speed = speed;
        this.gear = gear;
        this.cadence = cadence;
        this.color = color;
    }
//    public Bicycle(int startSpeed, int startGear, int startCadence, String startColor) {
//        gear = startGear;
//        speed = startSpeed;
//        cadence = startCadence;
//        color = startColor;
//    }

    //jiny konstruktor
    public Bicycle(String color) {
        this.color = color;
    }

    //konstruktor pro rychlost
    public Bicycle(int speed) {
        this.speed = speed;
    }

    //metody
    public void speedUp(int increment) {
        speed += increment;
    }
    public void setCadence(int newCadence) {
        this.cadence = newCadence;
    }
    public void applyBrake(int decrement) {
        speed -= decrement;
    }


}
