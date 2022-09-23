package homeworkone;

public abstract class Vehicle extends Product{
    //pass attributes from parent
    private int qty;
    private double price;
    //composition property
    private Engine engine;
    final double TAX = 0.15;
    private float speed;

    //constructor


    public Vehicle(String name, int qty, double price, Engine engine, float speed) {
        super(name);
        this.qty = qty;
        this.price = price;
        this.engine = engine;
        this.speed = speed;
    }

    //overload constructor
    public Vehicle(String name, int qty, double price, float speed) {
        super(name);
        this.qty = qty;
        this.price = price;
        this.speed = speed;
    }

    //getter and setters to use private variables in subclass
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    //methods
    public double totalBeforeTax(){
        return this.qty * this.price; //**
    }

    public double calcTax(){
        double formulaToGetTax = (this.qty * this.price) * TAX;
        return formulaToGetTax;
    }

    //abstract method
    public abstract void totalAfterTax();
}
