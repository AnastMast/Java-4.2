public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightInKilos = 85.4;
        double heightInMeter = 1.78;
        double bmi = service.calculate(weightInKilos, heightInMeter);
        System.out.println(bmi);
    }
}
