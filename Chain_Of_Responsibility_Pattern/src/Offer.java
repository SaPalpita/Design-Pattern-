public class Offer extends BillHandler{
    @Override
    public double applyDeduction(Bill bill) {
        bill.setDeduction(bill.getAmmount() - bill.getAmmount()*0.5);
        System.out.println("Offer Calculated");

        if(bill.getAmmount()<=5000){
            return bill.getAmmount();
        }
        else{
            return bill.getDeduction();
        }
    }
}
