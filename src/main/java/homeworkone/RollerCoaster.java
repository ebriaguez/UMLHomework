package homeworkone;

public class RollerCoaster implements IRideable{
    private double distance;
    private int hour;

    final double TAX = 0.20;

    public RollerCoaster(double distance, int hour) {
        this.distance = distance;
        this.hour = hour;
    }

    @Override
    public int milesPerHour() {
        double milesPerHourFormula = this.distance / this.hour;
        return (int) milesPerHourFormula;
    }
}
