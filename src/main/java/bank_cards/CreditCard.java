package bank_cards;

import bank_cards.bonuses.Transaction;

public class CreditCard extends BankCard{
    static private Integer LIMIT = 10000;
    private Double balance;
    private Double creditLimit;
    private Transaction transaction;
    private BonusType type;


    public CreditCard(Double balance, Double creditLimit) {
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.transaction = new Transaction();


    }

    @Override
    public Boolean transfer(Double transfer){
        if (creditLimit<LIMIT){
            creditLimit = creditLimit + transfer;
            if(creditLimit>LIMIT){
                Double bal = creditLimit-LIMIT;
                creditLimit = creditLimit -bal;
                balance = balance + bal;
                transaction.addTransfer(transfer);
                return true;
            }
        }else {
            balance = balance + transfer;
        }
        transaction.addTransfer(transfer);
        return true;

    }
    @Override
    boolean pay(Double pay){
        if (balance >= 0){
            balance = balance-pay;
            if(balance<0 && creditLimit>=0){
                creditLimit = creditLimit + balance;
                balance=0.;
                if (creditLimit < 0){
                    creditLimit=0.;
                    transaction.addPayments(pay,false);
                    return false;
                }
                transaction.addPayments(pay,true);
                return true;
            }
            if (balance==0&&creditLimit>=0){
                transaction.addPayments(pay,true);
                return true;
            }

        }this.transaction.addPayments(pay,false);
        return false;
    }

    public Double getCreditLimit() {
        System.out.println("Кредитные средства: " + this.creditLimit);
        return this.creditLimit;
    }

    @Override
    public Double getBalance() {
        System.out.println("Собственные средства: " + this.balance);
        return this.balance;
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
