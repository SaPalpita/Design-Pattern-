public class Discount extends BillHandler{

    @Override
    public double applyDeduction(Bill bill) {
        bill.setDeduction(bill.getAmmount() - bill.getAmmount()*0.1);
        System.out.println("Discount Calculated");

        if(bill.getAmmount()<=1000){
            return bill.getAmmount();
        }
        else{
            return bill.getDeduction();
        }
    }
}
