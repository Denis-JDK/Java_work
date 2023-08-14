package bank_cards;

abstract class BankCard {
    private Double balance;



    Boolean transfer(Double transfer){


         return true;
     }

     boolean pay(Double pay){
         return true;
     }

     public Double getBalance() {
         return balance;
     }
 }
