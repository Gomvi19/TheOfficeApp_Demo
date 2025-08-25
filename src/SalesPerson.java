// Class: Salesperson
// Represents a Salesperson in the office, the salesperson is able to make and record sales

public class SalesPerson {
    // Attributes
    private String name;
    private double salesFigure;
    private int reams_sold;

    //Constructor
    public SalesPerson(String name, double salesFigure, int reams_sold) {
        this.name = name;
        this.salesFigure = salesFigure;
        this.reams_sold = reams_sold;
    }

    // Overloading the constructor by creating a second one with different parameters
    public SalesPerson() {
        this.name = "Ryan";
        this.salesFigure = 0.0;
        this.reams_sold = 0;
    }

    //Setters and getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalesFigure() {
        return salesFigure;
    }
    public void setSalesFigure(double salesFigure) {
        this.salesFigure = salesFigure;
    }
    public int getreams_sold() {
        return reams_sold;
    }
    public void setreams_sold(int reams_sold) {
        this.reams_sold = reams_sold;
    }

    //Custom method: increase sales
    public void increasesales(double amountOfReams, double price){
        this.reams_sold += amountOfReams;
        this.salesFigure += amountOfReams * price;
    }

    //Print method
    public void printDetails(){
        System.out.println("SalesPerson Name: " + name + "\nSales Figure: " + salesFigure + "\nTotal Reams Sold: " + reams_sold);

    }
}
