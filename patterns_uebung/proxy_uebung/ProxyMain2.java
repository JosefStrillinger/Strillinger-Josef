public class ProxyMain2 {

    public static void main(String[] args) {
        Internet2 internet = new ProxyInternet2();

        try {
            internet.connectTo("nft.at");
            internet.connectTo("abc.at");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
