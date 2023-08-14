package bank_cards;

import bank_cards.bonuses.Transaction;

public class CreditCardCashback extends CreditCard{
    private Transaction transaction;

    public CreditCardCashback(Double balance, Double creditLimit) {
        super(balance,creditLimit);
        this.transaction=new Transaction();

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
    public Double getTransactionCashback(){
        return super.getTransactionCashback();
    }
    public void getTransactionList(){
        super.getTransactionCashbackList();
    }
}
