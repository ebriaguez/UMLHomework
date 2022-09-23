package homeworktwo;

public class Main {

    public static void main(String[] args) {

        Resolution resolution = new Resolution(2, 3);
        Monitor monitor = new Monitor(2, 4, 4, "1234", "Microsoft", "white");
        Dimensions dimensions = new Dimensions(2, 2, 4);
        Case cases = new Case("4321", "Apple", "Battery", dimensions);
        MotherBoard motherBoard = new MotherBoard("4567", "HP", "...",2, 1);

        //need assistance calling/invoking methods made on PC

    }
}
