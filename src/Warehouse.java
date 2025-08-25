//Warehouse class
//will track the supply of paper in the warehouse
public class Warehouse {
    private int paperSupply;

    //constructor and overloaded constructor
    public Warehouse(int paperSupply) {
        this.paperSupply = paperSupply;
    }
    public Warehouse() {
        this.paperSupply = 10000;
    }

    //Setters and Getters
    public int getPaperSupply() {
        return paperSupply;
    }
    public void setPaperSupply(int paperSupply) {
        this.paperSupply = paperSupply;
    }

    // custom method update paper supply to update supply available when paper is sold
    public void updatePaperSupply(int paperSupply) {
        this.paperSupply -= paperSupply;
        System.out.println("Current Paper Supply: " + this.paperSupply + " reams.");
    }

}
