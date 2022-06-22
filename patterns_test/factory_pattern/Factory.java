public class Factory {

    public Auto createAuto(Autos auto) {
        switch (auto) {
            case Audi:
                return new Audi();
            case VW:
                return new VW();
            default:
                return null;
        }

    }

}

enum Autos {
    Audi, VW
}
