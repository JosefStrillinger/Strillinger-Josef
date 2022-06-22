public class FactorySeries {
    public Series createSeries(Serien serie) {
        switch (serie) {
            case Hannibal:
                return new Hannibal();
            case Vikings:
                return new Vikings();
            default:
                return null;
        }
    }
}

enum Serien {
    Hannibal, Vikings
}
