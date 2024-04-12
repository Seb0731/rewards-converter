public class RewardValue {
    
    private double cash, miles;
    
    RewardValue(double cash) {
        this.cash = cash;
    }

    RewardValue(int miles) {
        this.miles = (double) miles;
    }

    public double getCashValue() {
        return this.cash ;
    }
    public double getMilesValue() {
        return this.miles;
    }

    public double cashToMiles() {
        return this.cash / 0.0035;
    }

    public double milesToCash() {
        return this.miles * 0.0035;
    }

}
