public class SemiAutoMode implements FiringMode {

    private static final int ROUNDS_PER_PULL = 1;

    @Override
    public int roundsFiredOnTriggerPull(int roundsInMagazine) {
        return Math.min(ROUNDS_PER_PULL, roundsInMagazine);
    }

    @Override
    public String name() {
        return "semiAutoMode";
    }
}
