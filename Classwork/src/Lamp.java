public class Lamp {
    private int power;
    Lamp(int power) {
        this.power = power;
    }

    public void switchLampOnOrOff() {
        if(power == 0) {
            System.out.println("Your lamp is turned off");
        }

        if(power > 0) {
            System.out.println("Your lamp lights with " + power + " wattage");
        }

        if(power < 0) {
            System.out.println("Your lamp is broken :(");
        }
    }
}