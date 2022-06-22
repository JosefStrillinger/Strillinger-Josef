public class RealInternet2 implements Internet2 {

    @Override
    public void connectTo(String server) throws Exception {
        System.out.println("Connecting to " + server);
    }
}
