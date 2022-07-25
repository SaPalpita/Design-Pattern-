public abstract class BillHandler {

    protected BillHandler successor;

    public void setSuccessor(BillHandler successor) {
        this.successor = successor;
    }

    public abstract double applyDeduction(Bill bill);
}
