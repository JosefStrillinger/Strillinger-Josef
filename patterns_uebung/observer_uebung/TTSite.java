public class TTSite extends Website {
    private Newsletter newsletter;
    
    private void setZeitung(Newsletter newsletter){
        this.newsletter = newsletter;
        sendNewsletter(newsletter);
    }
}
