public class FactoryAnimeMain {
    public static void main(String[] args) {
        FactoryAnime factory = new FactoryAnime();
        Anime anime = factory.createAnime(Animes.OnePiece);
        System.out.println(anime.name());
    }
}
