package SolidPrinciples;

public class Dmart {

    private final BankCard bankCard;

    public Dmart(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

}