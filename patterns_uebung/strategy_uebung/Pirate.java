public abstract class Pirate {
    private EssVerhalten essen;
    private TrinkVerhalten trinken;

    public void setEssVerhalten(EssVerhalten essen) {
        this.essen = essen;
    }

    public void setTrinkVerhalten(TrinkVerhalten trinken) {
        this.trinken = trinken;
    }

    public void essen() {
        essen.essen();
    }

    public void trinken() {
        trinken.trinken();
    }

}

class Luffy extends Pirate {
    public Luffy() {
        setEssVerhalten(new AllesEssenVernichten());
        setTrinkVerhalten(new NormalTrinken());
    }
}

class Zoro extends Pirate {
    public Zoro() {
        setEssVerhalten(new VielEssen());
        setTrinkVerhalten(new AlkoholikerTrinken());
    }
}
