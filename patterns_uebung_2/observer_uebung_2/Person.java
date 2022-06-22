public interface Person {
    public void erhalteEmail(EMail email);
}

class Marcel implements Person {

    @Override
    public void erhalteEmail(EMail email) {
        System.out.println("Marcel hat Email " + email.getTitle() + " erhalten");

    }

}
