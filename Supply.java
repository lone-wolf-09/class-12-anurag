class Demand {
    // Instance variables
    String pid;       // Product ID
    String pname;     // Product Name
    int pdemand;      // Quantity demanded

    // Parameterized constructor
    Demand(String pid, String pname, int pdemand) {
        this.pid = pid;
        this.pname = pname;
        this.pdemand = pdemand;
    }

    // Display product details
    void display() {
        System.out.println("Product ID: " + pid);
        System.out.println("Product Name: " + pname);
        System.out.println("Quantity Demanded: " + pdemand);
    }
}

public class Supply extends Demand {
    int pproduced;    // Quantity produced
    double prate;     // Cost per unit

    // Parameterized constructor (calls superclass constructor)
    Supply(String pid, String pname, int pdemand, int pproduced, double prate) {
        super(pid, pname, pdemand);  // initialize Demand class members
        this.pproduced = pproduced;
        this.prate = prate;
    }

    // Method to calculate difference in amount
    double calculation() {
        double demandAmount = pdemand * prate;
        double producedAmount = pproduced * prate;
        return demandAmount - producedAmount;
    }

    // Display product + calculation
    void display() {
        super.display();  // call parent display()
        System.out.println("Quantity Produced: " + pproduced);
        System.out.println("Cost per Unit: " + prate);
        System.out.println("Difference (Demand - Supply): " + calculation());
    }

    public static void main(String[] args) {
        // Example
        Supply obj = new Supply("P101", "Laptop", 100, 70, 50000.0);
        obj.display();
    }
}
// The Supply class extends Demand and adds functionality to calculate the difference
