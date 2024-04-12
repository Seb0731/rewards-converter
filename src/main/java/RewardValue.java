public class RewardValue {
    
    private double cash, miles;
    public static double MILESTOCASHCONVERSION = 0.0035;

    RewardValue(double cash) {
        this.cash = cash;
    }

    RewardValue(int miles) {
        this.miles = milesToCash(miles);
    }

    public static int cashToMiles(double cash) {
        return (int) (cash / MILESTOCASHCONVERSION);
    }

    public static double milesToCash(int miles) {
        return miles * MILESTOCASHCONVERSION;
    }

    public double getCashValue() {
        return this.cash ;
    }
    public double getMilesValue() {
        return cashToMiles(this.cash);
    }


}
