public class Firearm {

    private FiringMode firingMode;
    private int roundsInMagazine;

    public Firearm(FiringMode initialMode, int roundsInMagazine) {
        this.firingMode = initialMode;
        this.roundsInMagazine = roundsInMagazine;
    }

    public void setFiringMode(FiringMode newMode) {
        this.firingMode = newMode;
        System.out.println("Mode switched to " + newMode.name());
    }

    public void pullTrigger() {
        int fired = firingMode.roundsFiredOnTriggerPull(roundsInMagazine);
        roundsInMagazine -= fired;
        System.out.println("[" + firingMode.name() + "] fired " + fired
                + " round(s), " + roundsInMagazine + " left in magazine");
    }
}
