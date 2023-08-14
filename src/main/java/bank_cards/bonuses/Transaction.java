package bank_cards.bonuses;

import bank_cards.BonusType;
import bank_cards.CreditCardBalls;
import bank_cards.DebitCardBalls;

import java.time.LocalDateTime;

public class Transaction {
    private final LocalDateTime create;
    private String id = "id";
    boolean completed;
    private Balls balls;
    private Cashback cashback;
    private LoyaltyTransfer loyaltyTransfer;
    private BonusType type;

    public Transaction() {
        this.create = LocalDateTime.now();
        this.balls = new Balls();
        this.cashback = new Cashback();
        this.loyaltyTransfer = new LoyaltyTransfer();
        this.type = BonusType.BALLS;
    }

    public void getTransactionBallsList() {
        balls.getBalls(balls.getBallsList());
    }

    public Double getTransactionBallsSum() {
        return balls.getBallsSum(balls.getBallsList());
    }

    public void getTransactionCashbackList() {
        cashback.getCashback(cashback.getCashbacksList());
    }

    public Double getTransactionCashbackSum() {
        return cashback.getCashbackSum(cashback.getCashbacksList());
    }

    public void getTransactionLoyaltyTransferList() {
        loyaltyTransfer.getLoyaltyTransfer(loyaltyTransfer.getloyaltyTransferList());
    }

    public Double getTransactionLoyaltyTransferSum() {
        return loyaltyTransfer.getLoyaltyTransferSum(loyaltyTransfer.getloyaltyTransferList());
    }

    public void allBalance() {
        System.out.println("Balls: " + balls.getBallsSum(balls.getBallsList()));
        System.out.println("Cashback: " + cashback.getCashbackSum(cashback.getCashbacksList()));
        System.out.println("Balance + LoyaltyTransfer: " + loyaltyTransfer.getLoyaltyTransferSum(loyaltyTransfer.getloyaltyTransferList()));
    }
    public void addPayments(Double pay, boolean bool) {
        completed = bool;
        balls.addBalls(pay);
        cashback.addPayments(pay);
    }
    public void addPaymentsBalls(Double pay, boolean bool) {
        completed = bool;
        balls.addBalls(pay);

    }
    public void addPaymentsCashBack(Double pay, boolean bool) {
        completed = bool;
        cashback.addPayments(pay);
    }

    public void addTransfer(Double transfer){
        loyaltyTransfer.addLoyaltyTransfer(transfer);
    }

}
