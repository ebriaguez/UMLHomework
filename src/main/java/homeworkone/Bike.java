package homeworkone;

public class Bike extends Vehicle implements IRideable{

    public Bike(String name, int qty, double price, Engine engine, float speed) {
        super(name, qty, price, engine, speed);
    }

    //implementing the abstract method from parent
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
