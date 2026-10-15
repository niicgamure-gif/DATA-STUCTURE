package hospital;


public class Outpatient extends patient {



    private double labCharge;

    public Outpatient(String name, double consultFee, double labCharge) {
        super(name, consultFee);
        this.labCharge = labCharge;
    }

    public double CalculateBill() {
        return labCharge + consultFee;
    }

    public void Display() {
        System.out.println("Patient Name: " + name);
        System.out.println("Consult Fee: " + consultFee);
        System.out.println("Lab Charge: " + labCharge);
        System.out.println("Total Bill: " + CalculateBill());
    }
}