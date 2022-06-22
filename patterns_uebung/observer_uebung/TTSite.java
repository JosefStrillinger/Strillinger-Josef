public class TTSite extends Website {
    private Newsletter newsletter;

    public void setNewsletter(Newsletter newsletter) {
        this.newsletter = newsletter;
        sendNewsletter(newsletter);
    }

    public Newsletter getNewsletter() {
        return newsletter;
    }
}
