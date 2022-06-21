public class Main {
    public static void main(String[] args) {
        TTVerlag verlag = new TTVerlag();
        Knut knut = new Knut();
        verlag.aboHinzufügen(knut);
        verlag.setZeitung(new Zeitung("Guten Tag"));

        verlag.aboHinzufügen(new Kuma());
        verlag.setZeitung(new Zeitung("Guten Abend"));
        verlag.aboEntfernen(knut);

        verlag.setZeitung(new Zeitung("Guten Morgen"));
    }
}
