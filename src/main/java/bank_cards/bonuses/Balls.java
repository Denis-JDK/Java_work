package bank_cards.bonuses;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private List <Double>balls;

    public Balls(){
        this.balls=new ArrayList<>();
    }

    public void addBalls(Double pay){
        balls.add(pay/100*1);
    }
    public Double getBallsSum(List<Double> bal){
        double sum =0;
        for(int i = 0; i < bal.size(); i++)
            sum += bal.get(i);
        return sum;
    }

    public List<Double> getBallsList() {
        return balls;
    }
    public void getBalls(List<Double> bal){
        int count = bal.size();
        while (count!=0){
            for (Double b:bal){
                System.out.println("Balls: " + b);
                count--;
        }
        }
    }

}
