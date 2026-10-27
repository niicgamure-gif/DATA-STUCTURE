package ASSIGMENT1AND2and3;

public abstract class MedicalService {




        private  String sID;
        private  String sName;
        private double baseCost;

        public MedicalService(String sID ,String sName , double baseCost){
            this.sID = sID;
            this.sName = sName;
            this.baseCost = baseCost;
        }

        public String getsID(){
            return  sID;
        }
        public void setsID(String sID){
            this.sID= sID;
        }
        public String getsName(){
            return  sName;
        }
        public void setsName(String sName){
            this.sName =sName;
        }
        public double getBaseCost(){
            return baseCost;
        }
        public void setBaseCost(double baseCost){
            this.baseCost = baseCost;
        }

        public abstract double calculateTotalcost();

        public void displayServiceInfo(){
            System.out.println("Service ID : "+ getsID());
            System.out.println("Service : "+ getsName());
            System.out.println("Total Cost : $"+ calculateTotalcost());
        }

    }

    class Consultation extends MedicalService{
        protected  double doctorFee;

        public Consultation(String sID , String sName , double baseCost , double doctorFee){
            super(sID,sName,baseCost);
            this.doctorFee = doctorFee;
        }

        @Override
        public double calculateTotalcost() {
            return super.getBaseCost() + doctorFee;
        }


        @Override
        public void displayServiceInfo() {
            super.displayServiceInfo();
        }
    }


    class LaboratoryTest extends MedicalService{
        protected  double testCharge;

        public LaboratoryTest(String sID , String sName , double baseCost , double testCharge){
            super(sID,sName,baseCost);
            this.testCharge = testCharge;
        }

        @Override
        public double calculateTotalcost() {
            return super.getBaseCost() + testCharge;
        }

        @Override
        public void displayServiceInfo() {
            super.displayServiceInfo();
        }
    }


    class Ultrasound extends MedicalService{
        protected  double additionalFee;

        public Ultrasound(String sID , String sName , double baseCost , double additionalFee){
            super(sID,sName,baseCost);
            this.additionalFee = additionalFee;
        }

        @Override
        public double calculateTotalcost() {
            return super.getBaseCost() + additionalFee;
        }

        @Override
        public void displayServiceInfo() {
            super.displayServiceInfo();
        }
    }

    class maine{
        static void main() {

            MedicalService[] Service ={
                    new Consultation("S101","Consultation",15,10),
                    new LaboratoryTest("S202","Laboratory Test ",10,8),
                    new Ultrasound("S303","Ultrasound",27,13)
            };
            double total=0;
            System.out.println("----- Hospital Billing System -----");
            for(MedicalService S : Service){
                System.out.println();
                S.displayServiceInfo();
                System.out.println("----------------------------");
                total+=S.calculateTotalcost();

            }
            System.out.println("Total Hospital Bill : $"+total);
        }

    }
