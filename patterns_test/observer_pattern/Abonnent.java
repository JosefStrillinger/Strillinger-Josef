public interface Abonnent {
    public void erhalteZeitung(Zeitung zeitung);
}

class Knut implements Abonnent {

    @Override
    public void erhalteZeitung(Zeitung zeitung) {
        System.out.println("Knut hat Zeitung " + zeitung.getTitel() + " erhalten.");
    }
}

class Kuma implements Abonnent {

    @Override
    public void erhalteZeitung(Zeitung zeitung) {
        System.out.println("Kuma hat Zeitung " + zeitung.getTitel() + " erhalten.");
    }
}
