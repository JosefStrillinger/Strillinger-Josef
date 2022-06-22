public interface Anime {
    public String name();

    public int rating();
}

class Gintama implements Anime {

    @Override
    public String name() {
        return "Gintama";
    }

    @Override
    public int rating() {
        return 9;
    }
}

class OnePiece implements Anime {

    @Override
    public String name() {
        return "One Piece";
    }

    @Override
    public int rating() {
        return 9;
    }
}