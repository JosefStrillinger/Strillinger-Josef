public class OutlookClient extends EMailClient {
    private EMail email;

    public void setEmail(EMail email) {
        this.email = email;
        sendEMail(email);
    }

    public EMail getEmail() {
        return email;
    }
}
