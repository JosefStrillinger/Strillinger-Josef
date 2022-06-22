public abstract class Strawhat {
    private FightVerhalten fight;
    private RunVerhalten run;

    public void setFightVerhalten(FightVerhalten fight) {
        this.fight = fight;
    }

    public void setRunVerhalten(RunVerhalten run) {
        this.run = run;
    }

    public void fight() {
        fight.fight();
    }

    public void run() {
        run.run();
    }
}

class Sanji extends Strawhat {
    public Sanji() {
        setFightVerhalten(new StrongFight());
        setRunVerhalten(new NeverRun());
    }
}
