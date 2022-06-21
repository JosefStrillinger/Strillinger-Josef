import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
    private Internet internet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("google.at");
        bannedSites.add("youtube.com");
    }

    @Override
    public void connectTo(String server) throws Exception {
        if (bannedSites.contains(server)) {
            throw new Exception("You are not allowed to visit this site!");

        }
        internet.connectTo(server);
    }
}
