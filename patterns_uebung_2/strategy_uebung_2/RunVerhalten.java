public interface RunVerhalten {
    public void run();
}

class AlwaysRun implements RunVerhalten {

    @Override
    public void run() {
        System.out.println("...........run............");

    }

}

class NeverRun implements RunVerhalten {

    @Override
    public void run() {
        System.out.println("............................");

    }

}
