package bank_cards;

public class DebitCardBalls extends DebitCard {
    private Double balance;


    public DebitCardBalls(Double balance) {
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
            transaction.addPaymentsBalls(pay,false);
            return false;}
        else {
            Double bal = balance;
            if (balance >= 0){
                balance = balance-pay;
                if(balance<0){
                    balance=bal;
                    transaction.addPaymentsBalls(pay,false);
                    return false;
                }
            }
            if (balance>=0){
                transaction.addPaymentsBalls(pay,true);
                return true;
            }

        }transaction.addPaymentsBalls(pay,false);
        return false;
    }


    public Double getBalance() {
        return super.getBalance();
    }

    public Double getTransactionBalls(){
        return super.getTransactionBalls();
    }
    public void getTransactionList(){
        super.getTransactionBallsList();
    }
}
