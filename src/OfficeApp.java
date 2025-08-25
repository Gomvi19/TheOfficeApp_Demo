//Main class to demonstrate the creation and use of objects
public class OfficeApp {
    public static void main(String[] args) {
        //instantiating objects
        SalesPerson Jim =  new SalesPerson("Jim",1000,500);
        SalesPerson Dwight =  new SalesPerson("Dwight",2500,752);
        SalesPerson Ryan =  new SalesPerson();

        OfficeManager Michael = new OfficeManager("Michael",754.54);

        Warehouse scrantonWarehouse = new Warehouse(125000);

        //Using methods
        Jim.increasesales(1500,29.95);
        scrantonWarehouse.updatePaperSupply(1500);
        Dwight.increasesales(700,24.55);
        scrantonWarehouse.updatePaperSupply(700);
        Michael.organizeMeeting("Conflict Resolution","Conference Room");
        Michael.setTimeWasted(1505.34);

        //Printing Details
        Jim.printDetails();
        Dwight.printDetails();
        Ryan.printDetails();
        Michael.printDetails();
        System.out.println("The warehouse has " + scrantonWarehouse.getPaperSupply() + " reams of paper.");
    }
}
