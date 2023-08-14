package bank_cards.bonuses;

import java.util.ArrayList;
import java.util.List;

public class LoyaltyTransfer {
    private List <Double> balance;

    public LoyaltyTransfer() {
        this.balance = new ArrayList<>();
    }

    public void addLoyaltyTransfer(Double transfer){
        Double percent = (transfer / 100 * 0.005);
        Double bal = (transfer + percent);
        balance.add(bal);
    }

    public Double getLoyaltyTransferSum(List<Double> bal){
        double sum =0;
        for(int i = 0; i < bal.size(); i++)
            sum += bal.get(i);
        return sum;
    }

    public List<Double> getloyaltyTransferList() {
        return balance;
    }

    public void getLoyaltyTransfer(List<Double> bal){
        int count = bal.size();
        while (count!=0){
            for (Double b:bal){
                System.out.println("Balance + LoyaltyTransfer: " + b);
                count--;
            }
        }
    }
}
