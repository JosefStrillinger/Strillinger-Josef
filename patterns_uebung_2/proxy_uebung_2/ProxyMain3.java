public class ProxyMain3 {
    public static void main(String[] args) {
        Internet3 internet = new ProxyInternet3();
        try {
            internet.connectTo("google.com");
            internet.connectTo("marcel.com");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
