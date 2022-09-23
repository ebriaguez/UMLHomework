package homeworktwo;

public class Case {
    private String modelNumber, manufacturerName, powerSupply;
    private Dimensions dimensions;

    public Case(String modelNumber, String manufacturerName, String powerSupply, Dimensions dimensions) {
        this.modelNumber = modelNumber;
        this.manufacturerName = manufacturerName;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
}
