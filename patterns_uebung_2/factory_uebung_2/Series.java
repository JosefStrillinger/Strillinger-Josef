public interface Series {
    public String name();

    public int ranking();
}

class Vikings implements Series {

    @Override
    public String name() {
        return "Vikings";
    }

    @Override
    public int ranking() {
        return 7;
    }

}

class Hannibal implements Series {

    @Override
    public String name() {
        return "Hannibal";
    }

    @Override
    public int ranking() {
        return 9;
    }
}
