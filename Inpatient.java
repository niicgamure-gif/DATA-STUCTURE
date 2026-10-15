package hospital;


public class Inpatient extends patient {

    public double roomCharge;
    private int numberOfDays;

    public Inpatient(String name, double consultFee,
                     double roomCharge, int numberOfDays) {

        super(name, consultFee);

        this.roomCharge = roomCharge;
        this.numberOfDays = numberOfDays;
    }

    public double CalculateBill() {
        return (numberOfDays * roomCharge) + consultFee;
    }

    public void Display() {
        System.out.println("Patient Name: " + name);
        System.out.println("Consult Fee: " + consultFee);
        System.out.println("Room Charge: " + roomCharge);
        System.out.println("Number Of Days: " + numberOfDays);
        System.out.println("Total Bill: " + CalculateBill());
    }
}