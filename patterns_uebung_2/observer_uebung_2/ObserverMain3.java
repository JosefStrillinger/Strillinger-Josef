public class ObserverMain3 {
    public static void main(String[] args) {
        OutlookClient client = new OutlookClient();
        Marcel marcel = new Marcel();
        client.addPerson(marcel);
        client.sendEMail(new EMail("free virus"));
    }
}
