public class FactorySeriesMain {
    public static void main(String[] args) {
        FactorySeries factory = new FactorySeries();
        Series series = factory.createSeries(Serien.Hannibal);
        System.out.println(series.name());
    }
}
