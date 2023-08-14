package bank_cards;

public class BankCardMain {
    public static void main(String[] args) {

        CreditCardLoyaltyTransfer card = new CreditCardLoyaltyTransfer(0.,10000.);
        System.out.println("Кредитная карта с лимитом 10000:");
        System.out.println();
        card.getCreditLimit();
        card.getBalance();
        System.out.println();
        System.out.println("После пополнение карты на 5000:");
        System.out.println();
        card.transfer(5000.);
        card.getCreditLimit();
        card.getBalance();
        System.out.println();
        System.out.println("После оплаты на 5000:");
        System.out.println();
        card.pay(5000.);
        card.getCreditLimit();
        card.getBalance();
        System.out.println();
        System.out.println("После оплаты на 3000:");
        System.out.println();
        card.pay(3000.);
        card.getCreditLimit();
        card.getBalance();
        System.out.println();
        System.out.println("После пополнения на 2000:");
        System.out.println();
        card.transfer(2000.);
        card.getCreditLimit();
        card.getBalance();
        System.out.println();
        System.out.println("После пополнения на 2000:");
        System.out.println();
        card.transfer(2000.);
        card.getCreditLimit();
        card.getBalance();
        System.out.println();
        System.out.println("----------------------");


        DebitCardCashback cashCard = new DebitCardCashback(20000.);
        cashCard.pay(5000.);
        cashCard.pay(5000.);
        cashCard.pay(5000.);
        cashCard.transfer(4000.);
        cashCard.allBalance();

        System.out.println("----------------------");

        DebitCardBalls ballsCard = new DebitCardBalls(20000.);
        ballsCard.pay(5000.);
        ballsCard.pay(5000.);
        ballsCard.pay(5000.);
        ballsCard.transfer(4000.);
        System.out.println(ballsCard.getTransactionLoyaltyTransfer());
        ballsCard.allBalance();

        System.out.println("----------------------");

        CreditCardBalls cardBalls=new CreditCardBalls(10000.,14000.);

        cardBalls.pay(5000.);
        cardBalls.pay(5000.);
        cardBalls.pay(5000.);
        cardBalls.getCreditLimit();
        cardBalls.getBalance();
        cardBalls.transfer(3000.);
        cardBalls.getCreditLimit();
        cardBalls.getBalance();
        cardBalls.allBalance();



    }


}
