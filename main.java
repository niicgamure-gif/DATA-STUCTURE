package hospital;

public class main {

        public static void main(String[] args) {

            // Outpatient
            Outpatient op = new Outpatient("Nahwa", 20, 30);

            System.out.println("===== OUTPATIENT =====");
            op.Display();

            System.out.println();

            // Inpatient
            Inpatient ip = new Inpatient("Mohamed", 20, 50, 5);

            System.out.println("===== INPATIENT =====");

        }
    }
