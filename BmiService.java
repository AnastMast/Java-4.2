public class BmiService {
    public double calculate(double weightInKilos, double heightInMeter) {
        return weightInKilos / (heightInMeter * heightInMeter);
    }
}
