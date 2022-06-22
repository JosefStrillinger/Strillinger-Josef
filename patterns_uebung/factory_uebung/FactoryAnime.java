public class FactoryAnime {

    public Anime createAnime(Animes anime) {
        switch (anime) {
            case Gintama:
                return new Gintama();
            case OnePiece:
                return new OnePiece();
            default:
                return null;
        }
    }
}

enum Animes {
    Gintama, OnePiece
}
