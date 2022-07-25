public class Bill {
    private double ammount;
    private int billNumber;
    private double deduction;

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public double getAmmount() {
        return ammount;
    }

    public double getDeduction() {
        return deduction;
    }

    public int getBillNumber() {
        return billNumber;
    }

   public Bill(int billNumber,double ammount){
       this.billNumber=billNumber;
       this.ammount=ammount;
   }

}
