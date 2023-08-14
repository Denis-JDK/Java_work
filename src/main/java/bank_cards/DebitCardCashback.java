package bank_cards;

public class DebitCardCashback extends DebitCard {
    private Double balance;


    public DebitCardCashback(Double balance) {
        super(balance);
        this.balance = balance;

    }
    @Override
    public Boolean transfer(Double transfer){
        Boolean response = super.transfer(transfer);
        return response;
    }
    @Override
    boolean pay(Double pay){
        if (balance<0){
            System.out.println("Balance > 0: " + balance);
            transaction.addPaymentsCashBack(pay,false);
            return false;}
        else {
            Double bal = balance;
            if (balance >= 0){
                balance = balance-pay;
                if(balance<0){
                    balance=bal;
                    transaction.addPaymentsCashBack(pay,false);
                    return false;
                }
            }
            if (balance>=0){
                transaction.addPaymentsCashBack(pay,true);
                return true;
            }

        }transaction.addPaymentsCashBack(pay,false);
        return false;
    }

    public Double getBalance() {
        return super.getBalance();
    }
    public Double getTransactionCashback(){
        return super.getTransactionCashback();
    }
    public void getTransactionList(){
        super.getTransactionCashbackList();
    }
}

