//  Week 4 lab (instantiable class) currency converter
// 17/2/23
// Adam Plesca author

//4/4/23 origanlly got 0/5 on this graded lab so went back today and finished the program(s) properly.
public class Money{
    private double cash,revolut, total, pounds;
    private final double RATE=.89;

    public void setCash(double cash){
        this.cash=cash;
    }
    public void setRev(double revolut){
        this.revolut = revolut;
    }
    public void computeTotal(){
        total = cash+revolut;
    }
    public void computePounds(){
        pounds = total*RATE;
    }
    public double getEuro(){
        return total;
    }
    public double getPounds(){
        return pounds;
    }
}