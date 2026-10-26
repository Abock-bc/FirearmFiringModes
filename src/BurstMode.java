public class BurstMode implements FiringMode {

    private static final int ROUNDS_PER_BURST = 3;

    @Override
    public int roundsFiredOnTriggerPull(int roundsInMagazine) {
        return Math.min(ROUNDS_PER_BURST, roundsInMagazine);
    }

    @Override
    public String name() {
        return "burst";
    }
}
