package homeworktwo;

public abstract class PC {
    //instance variables
    private Case caseType;
    private MotherBoard motherBoard;
    private Monitor monitor;

    public PC(Case caseType, MotherBoard motherBoard, Monitor monitor) {
        this.caseType = caseType;
        this.motherBoard = motherBoard;
        this.monitor = monitor;
    }

    public Case getCaseType() {
        return caseType;
    }

    public void setCaseType(Case caseType) {
        this.caseType = caseType;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    private void drawLogo(){
        System.out.println();
    }

    public void description(){
        System.out.println("Welcome to worst buy below is the description of the PC on sale today" + "\n" + this.caseType + this.monitor + this.motherBoard);
    }

    public void powerUp(){
        System.out.println();
    }
}
