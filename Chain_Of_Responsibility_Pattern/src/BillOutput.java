public class BillOutput {

    public static void main(String[] args) {
        Discount discount=new Discount();
        Offer offer=new Offer();

        offer.setSuccessor(discount);
        discount.setSuccessor(offer);

        Bill bill=new Bill(1,10000);
        System.out.println(discount.applyDeduction(bill));

        Bill bill2=new Bill(2,15000);
        System.out.println(offer.applyDeduction(bill2));
    }

}
