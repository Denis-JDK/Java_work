package bank_cards;

import bank_cards.bonuses.Transaction;

public class CreditCardLoyaltyTransfer extends CreditCard{
    private CreditCard creditCard;
    private Transaction transaction;
    public CreditCardLoyaltyTransfer(Double balance, Double creditLimit) {
        super(balance, creditLimit);
        this.transaction = new Transaction();
    }

    @Override
    public Boolean transfer(Double transfer){
        Boolean response = super.transfer(transfer);
        transaction.addTransfer(transfer);
        return response;
    }
    @Override
    boolean pay(Double pay){
        boolean response = super.pay(pay);
        return response;
    }

    @Override
    public Double getBalance() {
        return super.getBalance();
    }

    public Double getCreditLimit() {
        return super.getCreditLimit();
    }
    public Double getTransactionLoyaltyTransfer(){
        return transaction.getTransactionLoyaltyTransferSum();
    }
    public void getTransactionLoyaltyTransferList(){
        transaction.getTransactionLoyaltyTransferList();
    }
//    public Double getTransactionLoyaltyTransfer(){
//        return super.getTransactionLoyaltyTransfer();
//    }
//    public void getTransactionList(){
//        super.getTransactionLoyaltyTransferList();
//    }


}
