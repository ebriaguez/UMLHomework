package homeworkone;

public class Truck extends Vehicle implements IRideable{

    public Truck(String name, int qty, double price, Engine engine, float speed) {
        super(name, qty, price, engine, speed);
    }

    @Override
    public void totalAfterTax() {
        double totalFormula = totalBeforeTax() + calcTax();
        System.out.println(this.name + " total after tax: $" + totalFormula);
    }

    @Override
    public int milesPerHour() {
        return (int) this.getSpeed();
    }
}
