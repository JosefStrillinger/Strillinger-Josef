public class StrategyMain2 {
    public static void main(String[] args) {
        Luffy luffy = new Luffy();
        luffy.essen();
        luffy.trinken();
        luffy.setTrinkVerhalten(new VielTrinken());
        luffy.trinken();
    }
}
