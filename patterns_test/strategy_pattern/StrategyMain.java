public class StrategyMain {

    public static void main(String[] args) {
        Husky husky = new Husky();
        husky.bellen();
        husky.laufen();
        husky.setBellVerhalten(new LautBellen());
        husky.bellen();
    }
}