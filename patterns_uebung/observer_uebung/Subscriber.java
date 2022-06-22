public interface Subscriber {
    public void erhalteNewsletter(Newsletter newsletter);
}

class Fabi implements Subscriber {

    @Override
    public void erhalteNewsletter(Newsletter newsletter) {
        System.out.println("Fabi hat Newsletter" + newsletter + "erhalten");
    }
}
