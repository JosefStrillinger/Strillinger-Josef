public interface TrinkVerhalten {
    public void trinken();
}

class NormalTrinken implements TrinkVerhalten {

    @Override
    public void trinken() {
        System.out.println("Normal trinken: glug glug");

    }

}

class VielTrinken implements TrinkVerhalten {

    @Override
    public void trinken() {
        System.out.println("Viel trinken: glug glug glug glug");

    }

}

class AlkoholikerTrinken implements TrinkVerhalten {

    @Override
    public void trinken() {
        System.out.println("Alkoholiker trinken: GLUG GLUG GLUG GLUG GLUG GLUG GLUG GLUG");

    }

}