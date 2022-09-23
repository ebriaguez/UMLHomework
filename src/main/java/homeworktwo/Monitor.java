package homeworktwo;

public class Monitor {
    private int resolution, x, y;
    private String modelNumber, manufacturersName, color;


    public Monitor(int resolution, int x, int y, String modelNumber, String manufacturersName, String color) {
        this.resolution = resolution;
        this.x = x;
        this.y = y;
        this.modelNumber = modelNumber;
        this.manufacturersName = manufacturersName;
        this.color = color;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getManufacturersName() {
        return manufacturersName;
    }

    public void setManufacturersName(String manufacturersName) {
        this.manufacturersName = manufacturersName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void drawPixel(int x, int y, String color){
        System.out.println("Drawing pixel at " + this.x + " " + this.y + " " + "in color" + this.color);
    }
}
