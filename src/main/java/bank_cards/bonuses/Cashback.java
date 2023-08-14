package bank_cards.bonuses;

import java.util.ArrayList;
import java.util.List;

public class Cashback {
    private List<Double> payments;
    private List<Double> cashback;

    public Cashback() {
        this.payments = new ArrayList<>();
        this.cashback = new ArrayList<>();
    }

    public void addPayments(Double pay){
        payments.add(pay);
        addCashback(pay);
    }

    public void addCashback(Double pay){
        double sum =0;
           for(int i = 0; i < payments.size(); i++)
               sum += payments.get(i);
           if (sum>=5000){
               Double i = 5000-sum;
               if (i<0){
                   cashback.add((Math.abs(i)/100*5));
                   return;
               }
               payments.add((pay/100*5));
           }

       }

    public Double getCashbackSum(List<Double> bal){
        double sum =0;
        for(int i = 0; i < bal.size(); i++)
        { sum += bal.get(i);}
        double result = (sum-5000);
        if (result<=0){
            result = 0.;
            return result;
        }
        return result/100*5;
    }

    public List<Double> getCashbacksList() {
        return payments;
    }
    public void getCashback(List<Double> cash){
        int count = cash.size();
        while (count!=0){
            for (Double c:cash){
                System.out.println("Cashback: " + c);
                count--;
            }
        }
    }
}
