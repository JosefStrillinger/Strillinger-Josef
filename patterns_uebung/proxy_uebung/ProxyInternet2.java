import java.util.ArrayList;
import java.util.List;

public class ProxyInternet2 implements Internet2 {

    private Internet2 internet = new RealInternet2();
    private static List<String> bannedSites;
    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.at");
        bannedSites.add("def.at");
    }

    @Override
    public void connectTo(String server) throws Exception {
        if (bannedSites.contains(server)) {
            throw new Exception();
        }
        internet.connectTo(server);
    }

}
