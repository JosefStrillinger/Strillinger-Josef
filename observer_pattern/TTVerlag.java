public class TTVerlag extends Verlag {
    private Zeitung zeitung;

    public void setZeitung(Zeitung zeitung) {
        this.zeitung = zeitung;
        verteileZeitung(zeitung);
    }

    public Zeitung getZeitung() {
        return zeitung;
    }
}
