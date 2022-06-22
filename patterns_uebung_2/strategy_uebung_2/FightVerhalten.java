public interface FightVerhalten {
    public void fight();
}

class WeakFight implements FightVerhalten {

    @Override
    public void fight() {
        System.out.println(".................");

    }

}

class StrongFight implements FightVerhalten {

    @Override
    public void fight() {
        System.out.println("I have all the power in the world!!!!");

    }

}
