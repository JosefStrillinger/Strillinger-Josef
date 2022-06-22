public class ObserverMain2 {

    public static void main(String[] args) {
        TTSite site = new TTSite();
        Fabi fabi = new Fabi();
        site.addSubscriber(fabi);
        site.setNewsletter(new Newsletter("One Piece"));
    }
}
