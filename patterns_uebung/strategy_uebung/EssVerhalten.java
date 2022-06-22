public interface EssVerhalten {
    public void essen();
}

class NormalEssen implements EssVerhalten {

    @Override
    public void essen() {
        System.out.println("Normal essen: nom nom");

    }

}

class VielEssen implements EssVerhalten {

    @Override
    public void essen() {
        System.out.println("Viel essen: nom nom nom nom");

    }

}

class AllesEssenVernichten implements EssVerhalten {

    @Override
    public void essen() {
        System.out.println("Verbrennungsofen essen: NOM NOM NOM NOM NOM NOM NOM");

    }

}
