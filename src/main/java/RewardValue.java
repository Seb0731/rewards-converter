public class RewardValue {
    
    private double cash, miles;
    public static double MILESTOCASHCONVERSION = 0.0035;

    RewardValue(double cash) {
        this.cash = cash;
    }

    RewardValue(int miles) {
        this.miles = miles;
    }
    
    public double getCashValue() {
        return this.cash ;
    }
    public double getMilesValue() {
        return this.miles;
    }

    public int cashToMiles(double cash) {
        return (int) (cash / MILESTOCASHCONVERSION);
    }

    public double milesToCash(int miles) {
        return miles * MILESTOCASHCONVERSION;
    }


}
