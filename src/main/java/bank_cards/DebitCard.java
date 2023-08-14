package bank_cards;

import bank_cards.bonuses.Transaction;

public class DebitCard extends BankCard {
    private Double balance;
    protected Transaction transaction;



    public DebitCard(Double balance) {
        this.balance = balance;
        this.transaction = new Transaction();

    }

    @Override
    public Boolean transfer(Double transfer){
        balance = balance + transfer;
        transaction.addTransfer(transfer);
        return true;

    }
    @Override
    boolean pay(Double pay){
        if (balance<0){
            System.out.println("Balance > 0: " + balance);
            transaction.addPayments(pay,false);
            return false;}
        else {
        Double bal = balance;
        if (balance >= 0){
            balance = balance-pay;
            if(balance<0){
                balance=bal;
                transaction.addPayments(pay,false);
                return false;
                }
            }
            if (balance>=0){
                transaction.addPayments(pay,true);
                return true;
            }

        }transaction.addPayments(pay,false);
        return false;
    }


    @Override
    public Double getBalance() {
        System.out.println("Собственные средства: " + balance);
        return balance;
    }

    public Double getTransactionCashback(){
        return transaction.getTransactionCashbackSum();
    }
    public void getTransactionCashbackList(){
        transaction.getTransactionCashbackList();
    }
    public Double getTransactionBalls(){
        return transaction.getTransactionBallsSum();
    }
    public void getTransactionBallsList(){
        transaction.getTransactionBallsList();
    }
    public Double getTransactionLoyaltyTransfer(){
        return transaction.getTransactionLoyaltyTransferSum();
    }
    public void getTransactionLoyaltyTransferList(){
        transaction.getTransactionLoyaltyTransferList();
    }
    public void allBalance(){
        transaction.allBalance();
    }
}
