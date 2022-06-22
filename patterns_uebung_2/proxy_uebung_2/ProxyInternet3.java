import java.util.ArrayList;
import java.util.List;

public class ProxyInternet3 implements Internet3 {

    private Internet3 internet = new RealInternet3();
    private static List<String> bannedSites;
    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("marcel.com");
    }

    @Override
    public void connectTo(String server) throws Exception {
        if (bannedSites.contains(server)) {
            throw new Exception();
        }
        internet.connectTo(server);
    }

}
